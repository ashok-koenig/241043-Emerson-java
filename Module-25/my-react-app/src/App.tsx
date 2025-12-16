import './App.css'

function App() {
  const message = "Working with JSX"
  const hello = <h2>Hello JSX</h2>
  const handleClick = () => alert("Button click works")
  return (
      <>
        <h1 className='card'>Welcome to React</h1>
        <p>{message}</p>
        {hello}
        <hr />
        <button onClick={ handleClick }>Click me</button>
      </>
  )
}

export default App
