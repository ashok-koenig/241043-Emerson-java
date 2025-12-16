import { useRef, useState } from 'react'
import './App.css'

function App() {  
  const inputRef = useRef<HTMLInputElement>(null)

  const [items, setItems] = useState<string[]>([])

  const addItem = () => {    
    if(inputRef.current?.value){
      const newItem = inputRef.current?.value
      setItems([...items, newItem])
      inputRef.current.value = ''
    }
  }

  return (
    <>
      <h1>Working with useRef Hook</h1>
      <input ref={inputRef}/>
      <button onClick={()=> inputRef.current?.focus()}>Focus Input</button>
      <button onClick={addItem}>Add Item</button>
      <ol>
        {items.map((item, index)=> <li key={index}>{item}</li>)}
      </ol>
    </>
  )
}

export default App
