import { useEffect, useState } from 'react'
import './App.css'
import ProductList from './components/ProductList'
import type Product from './models/Product'
import { createProduct, getProducts } from './services/productApi'
import ProductForm from './components/ProductForm'

function App() {

  const [products, setProducts] = useState<Product[]>([])
  
  const loadProducts = async () => {
    const data = await getProducts();
    console.log(data)
    setProducts(data);
  }

  useEffect(()=>{
    loadProducts()
  }, [])

  const handleSave = async (product: Product) => {
    await createProduct(product)
    loadProducts()
  }

  return (
    <>
      <h1>Product Management App</h1>
      <ProductList products={products}/>
      <hr />
      <ProductForm onSave={handleSave} />
    </>
  )
}

export default App
