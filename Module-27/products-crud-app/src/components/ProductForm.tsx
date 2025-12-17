import { useEffect, useState } from 'react'
import type Product from '../models/Product'

interface Props {
    onSave: (product: Product) => void
    selectedProduct?: Product | null
}

export default function ProductForm(props: Props) {
    const [name, setName] = useState<string>("")
    const [price, setPrice] = useState<number>(0)

    const [nameError, setNameError] = useState<string | null> (null)
    const [priceError, setPriceError] = useState<string | null> (null)

    useEffect(()=>{
        if(props.selectedProduct){
            setName(props.selectedProduct.name)
            setPrice(props.selectedProduct.price)
        }
    }, [props.selectedProduct])
    const handleSubmit = ()=> {
        setNameError(null)
        setPriceError(null)
        if(name.length==0){
            setNameError("Name is required")
            return;
        }
        if(!Number(price)){
            setPriceError("Invalid price")
            return;
        }
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
            <p style={{color: "red"}}>{nameError}</p>
        </div>
        <div>
            Product Price: 
            <input onChange={(e)=> setPrice(Number(e.target.value))} value={price} />
            <p style={{color: "red"}}>{priceError}</p>
        </div>
        <button onClick={handleSubmit}>
            {props.selectedProduct ? "Update product": "Add Product"}
        </button>
    </div>
  )
}
