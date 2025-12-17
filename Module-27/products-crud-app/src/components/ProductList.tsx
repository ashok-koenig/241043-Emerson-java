import type Product from "../models/Product"

interface Props {
    products: Product[]
}

export default function ProductList(props: Props) {
  return (
    <div>
        <table style={{border: "2px solid black"}}>
            <thead>
                <tr>
                    <th>Product name</th>
                    <th>Product price</th>
                </tr>
            </thead>
            <tbody>
            {
                props.products.map((product) => (<tr key={product.id}>
                    <td>{product.name}</td>
                    <td>{product.price}</td>
                </tr>))
            }
            </tbody>
        </table>
    </div>
  )
}
