import { useState } from 'react'
import './App.css'

function App() {

  const [color, setColor] = useState("green")

  const [isActive, setIsActive] = useState(false)
  
  return (
    <>
      <h1 className='title'>Working with CSS Styling in React</h1>
      <p style={{color: "green"}}>React Inline style</p>
      <p style={{color}} onClick={()=> setColor("orange")}>Dynamic styling demo</p>

      <p className={isActive?"active":"inactive"}>
        User Status: {isActive?"Active": "Inactive"}
      </p>
      <button onClick={()=> setIsActive(!isActive)}>Toggle User Status</button>
    </>
  )
}

export default App
