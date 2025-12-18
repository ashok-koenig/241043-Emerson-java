import { configureStore } from "@reduxjs/toolkit";
import cakeReducer from "./cakeSlice"
import productsReducer from "./productSlice"
const store = configureStore({
    reducer: {
        cakeCount : cakeReducer,
        products: productsReducer
    }
})

export default store;