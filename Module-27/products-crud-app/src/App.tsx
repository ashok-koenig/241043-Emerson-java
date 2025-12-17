import { useEffect, useState } from 'react'
import './App.css'
import ProductList from './components/ProductList'
import type Product from './models/Product'
import { getProducts } from './services/productApi'

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

  return (
    <>
      <h1>Product Management App</h1>
      <ProductList products={products}/>
    </>
  )
}

export default App
