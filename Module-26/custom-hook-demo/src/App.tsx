
import './App.css'
import useCounter from './hooks/useCounter'

function App() {

  const {count, increment} = useCounter(0)

  return (
    <>
      <h1>Working with custom hook in React</h1>
      <h3>Current count: {count}</h3>
      <button onClick={increment}>Increment</button>
    </>
  )
}

export default App
