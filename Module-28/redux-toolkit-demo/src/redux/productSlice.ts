import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";

export const getProducts = createAsyncThunk("products/getProducts", async ()=>{
    const response = await fetch("http://localhost:8080/products")
    const data = await response.json();
    return data;
})

const productSlice = createSlice({
    name: "products",
    initialState: {
        products: [],
        loading: false,
        error: ''
    },
    reducers: {},
    extraReducers: (builder) => {
        builder.addCase(getProducts.pending, (state)=> {
            state.loading = true;
            state.error =''
        });
        builder.addCase(getProducts.fulfilled, (state, action)=>{
            state.loading = false
            state.error = ''
            state.products = action.payload
        })
        builder.addCase(getProducts.rejected, (state)=>{
            state.loading = false
            state.error = "Failed to load the product data"
        })
    }
})

export default productSlice.reducer