import { useEffect, useState } from 'react'
import type Product from '../models/Product'

interface Props {
    onSave: (product: Product) => void
    selectedProduct?: Product | null
}

export default function ProductForm(props: Props) {
    const [name, setName] = useState<string>("")
    const [price, setPrice] = useState<number>(0)

    useEffect(()=>{
        if(props.selectedProduct){
            setName(props.selectedProduct.name)
            setPrice(props.selectedProduct.price)
        }
    }, [props.selectedProduct])
    const handleSubmit = ()=> {
        if(props.selectedProduct){
            props.onSave({...props.selectedProduct, name, price})
        }else{
            props.onSave({name, price})         
        }
        setName('')
        setPrice(0)
    }
  return (
    <div>
        <h3>{props.selectedProduct ? "Update product": "Add Product"}</h3>
        <div>
            Product Name: 
            <input onChange={(e)=> setName(e.target.value)} value={name} />
        </div>
        <div>
            Product Price: 
            <input onChange={(e)=> setPrice(Number(e.target.value))} value={price} />
        </div>
        <button onClick={handleSubmit}>
            {props.selectedProduct ? "Update product": "Add Product"}
        </button>
    </div>
  )
}
