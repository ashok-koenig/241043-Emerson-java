import { useState } from 'react';
import './App.css'

function App() {

  const [count, setCount] = useState(0)

  const increment = () => {
    setCount( count + 1)
  }

  const [name, setName] = useState("John")

  const updateName = () => {
    setName("John Smith")
  }
  // console.log(useState(0))

  // let count =0;
  // const increment = () => {
  //   count ++;
  //   alert("Current count: "+ count)
  // }

  
  
  return (
    <>
      <h1>Working with State Management in React</h1>
      <h3>Current count: {count}</h3>
      <button onClick={increment}>Increment</button>
      <h3>Name: {name}</h3>
      <button onClick={updateName}>Change name</button>
    </>
  )
}

export default App
