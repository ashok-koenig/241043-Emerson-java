import { useEffect, useState } from 'react'
import './App.css'
import ProductList from './components/ProductList'
import type Product from './models/Product'
import { createProduct, deleteProduct, getProducts, updateProduct } from './services/productApi'
import ProductForm from './components/ProductForm'

function App() {

  const [products, setProducts] = useState<Product[]>([])
  const [selectedProduct, setSelectedProduct] = useState<Product | null>(null)
  
  const loadProducts = async () => {
    const data = await getProducts();
    console.log(data)
    setProducts(data);
  }

  useEffect(()=>{
    loadProducts()
  }, [])

  const handleSave = async (product: Product) => {
    if(product.id){
      await updateProduct(product)
    }else{
      await createProduct(product)
    }
    setSelectedProduct(null)
    loadProducts()
  }

  const handleDelete = async (id: string) => {
    const result = confirm("Are you sure, do you want to delete the product?")
    if(result){
      await deleteProduct(id)
      loadProducts()
    }
  }

  return (
    <>
      <h1>Product Management App</h1>
      <ProductList products={products} 
                  onEdit={setSelectedProduct}
                  onDelete={handleDelete}/>
      <hr />
      <ProductForm onSave={handleSave} selectedProduct= {selectedProduct}/>
    </>
  )
}

export default App
