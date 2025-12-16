import './App.css'
import ClassComponent from './components/ClassComponent'
import Footer from './components/Footer'
import Header from './components/Header'

function App() {
  let message = "Working with JSX"
  message = "ANother message"
  const hello = <h2>Hello JSX</h2>
  const handleClick = () => alert("Button click works")
  return (
      <>
      <Header title="ABC Company Pvt Ltd" />
      <Header title="Emerson" />
      <hr />
      <ClassComponent />
        <h1 className='card'>Welcome to React</h1>
        <p>{message}</p>
        {hello}        
        <button onClick={ handleClick }>Click me</button>
        <hr />
        <Footer />
      </>
  )
}

export default App
