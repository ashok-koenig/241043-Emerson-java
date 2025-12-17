
import { useEffect, useState } from 'react'
import './App.css'

function App() {

  const [count, setCount] = useState(0)
  const [name, setName] = useState('John')

  useEffect(()=>{
    console.log("Use effect works...")
  },[name])
  
  return (
    <>
     <h1>Working with useEffect Hook in React</h1>
     <h3>Current Count: {count}</h3>
     <button onClick={() => setCount(count + 1)}>Increment</button>
     <h3>Name: {name}</h3>
     <button onClick={() => setName("Smith")}>Change name</button>
    </>
  )
}

export default App
