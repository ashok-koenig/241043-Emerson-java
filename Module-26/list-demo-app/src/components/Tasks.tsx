import React, { useState } from 'react'

export default function Tasks() {
    const [items, setItems] = useState<string[]>([])

    const [newItem, setNewItem] = useState<string>("")

    const addItem = () =>{
        if(newItem){
            setItems([...items, newItem])
            setNewItem('')
        }
    }
  return (
    <div>
        <h3>Task app</h3>
        <input onChange={(e) => setNewItem(e.target.value)} value={newItem}/>
        <button onClick={addItem}>Add Item</button>
        <ol>
            {items.map((item, index)=> <li key={index}>{item}</li>)}
        </ol>
    </div>
  )
}
