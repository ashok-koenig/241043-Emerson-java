import { useState } from 'react'
import type Product from '../models/Product'

interface Props {
    onSave: (product: Product) => void
}

export default function ProductForm(props: Props) {
    const [name, setName] = useState<string>("")
    const [price, setPrice] = useState<number>(0)
    const handleSubmit = ()=> {
        props.onSave({name, price})
    }
  return (
    <div>
        <h3>Add product</h3>
        <div>
            Product Name: 
            <input onChange={(e)=> setName(e.target.value)} value={name} />
        </div>
        <div>
            Product Price: 
            <input onChange={(e)=> setPrice(Number(e.target.value))} value={price} />
        </div>
        <button onCanPlay={handleSubmit}>Add Product</button>
    </div>
  )
}
