import { createSlice } from "@reduxjs/toolkit";

const cakeSlice = createSlice({
    name: "cakeCount",
    initialState: {
        noOfCake: 30
    },
    reducers: {
        buyCake: (state, action) => {
            state.noOfCake -= action.payload
        }
    }
})

export const {buyCake} = cakeSlice.actions

export default cakeSlice.reducer