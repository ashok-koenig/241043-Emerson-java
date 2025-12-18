import { useRef } from "react"
import { useDispatch, useSelector } from "react-redux"
import { buyCake } from "../redux/cakeSlice"

export default function CakeShop2() {
    const {noOfCake} = useSelector<any, any>((state)=> state.cakeCount)
    const cakeInput = useRef<HTMLInputElement>(null)
    const dispatch = useDispatch()
  return (
    <div>
        <h2>Cake Shop - Counter 2</h2>
        <h4>Current Cake Count: {noOfCake}</h4>
        <input ref={cakeInput} placeholder="Enter cake quantity" />
        <button onClick={()=> dispatch(buyCake(Number(cakeInput.current?.value)))}>Buy Cake</button>
    </div>
  )
}
