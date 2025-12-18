import { useEffect } from "react"
import { useDispatch, useSelector } from "react-redux"
import { getProducts } from "../redux/productSlice";

export default function ProductsList() {

    const {products, loading, error} = useSelector<any, any>((state)=> state.products)

    const dispatch = useDispatch<any>();
    useEffect(()=>{
        dispatch(getProducts())
    }, [])

    if(loading) return <p>Loading....</p>
    if(error) return <p>{error}</p>
  return (
    <div>
        <h3>Products List</h3>
        <ol>
            {
                products.map((product:any)=> (<li key={product.id}>
                    {product.name} - {product.price}
                </li>))
            }
        </ol>
    </div>
  )
}
