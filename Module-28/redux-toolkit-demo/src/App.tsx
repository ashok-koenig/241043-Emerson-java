import { Provider } from 'react-redux'
import './App.css'
import CakeShop from './components/CakeShop'
import store from './redux/store'
import CakeShop2 from './components/CakeShop2'
import ProductsList from './components/ProductsList'

function App() {
  
  return (
    <Provider store={store}>
     <h1>Working wiht Redux Toolkit in React</h1>
     <CakeShop />
     <CakeShop2 />
     <ProductsList />
    </Provider>
  )
}

export default App
