import './App.css'
import Tasks from './components/Tasks'

function App() {
  const friends = ["JOhn", "Peter", "Smith", "Bob"]
  return (
    <>
      <h1>Working with list rendering in React</h1>
      <h3>Friends list</h3>
      <ol>
        {
          friends.map((name, index)=> <li key={index}>{name}</li>)
        }
      </ol>
      <hr/>
      <Tasks />
    </>
  )
}

export default App
