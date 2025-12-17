import type Product from "../models/Product";

export const getProducts = async () => {
    const response = await fetch("http://localhost:8080/products")
    return response.json();
}

export const createProduct= async (newProduct: Product) => {
    await fetch("http://localhost:8080/products", {
        method: "POST",
        headers: {"Content-Type": "application/json"},
        body: JSON.stringify(newProduct)
    })
}