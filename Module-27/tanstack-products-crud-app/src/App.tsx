import { useState } from 'react'
import './App.css'
import ProductList from './components/ProductList'
import type Product from './models/Product'
import { createProduct, deleteProduct, getProducts, updateProduct } from './services/productApi'
import ProductForm from './components/ProductForm'
import { useMutation, useQuery, useQueryClient } from '@tanstack/react-query'

function App() {

  const [selectedProduct, setSelectedProduct] = useState<Product | null>(null)
  
  const {data : products, isLoading, error} = useQuery({
    queryKey: ["products"],
    queryFn: getProducts
  })

  const queryClient = useQueryClient();

  const saveMutation = useMutation({
    mutationFn: (product: Product) => {
      return product.id ? updateProduct(product) : createProduct(product)
    },
    onSuccess: () => {
      queryClient.invalidateQueries({queryKey: ["products"]})
      setSelectedProduct(null)
    }
  })

  const deleteMutation = useMutation({
    mutationFn: deleteProduct,
    onSuccess: ()=> {
      queryClient.invalidateQueries({queryKey: ["products"]})
    }
  })

  if(isLoading) return <p>Loading products...</p>
  if(error) return <p>Failed to load products...</p>

  return (
    <>
      <h1>Product Management App</h1>
      <ProductList products={products} 
                  onEdit={setSelectedProduct}
                  onDelete={deleteMutation.mutate}/>
      <hr />
      <ProductForm onSave={(p)=> saveMutation.mutate(p)} selectedProduct= {selectedProduct}/>
    </>
  )
}

export default App
