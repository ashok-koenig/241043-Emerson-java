import type Product from "../models/Product"

interface Props {
    products: Product[]
}

export default function ProductList(props: Props) {
  return (
    <div>
        <table style={{border: "2px solid black"}}>
            <tr>
                <th>Product name</th>
                <th>Product price</th>
            </tr>
            {
                props.products.map((product) => (<tr>
                    <td>{product.name}</td>
                    <td>{product.price}</td>
                </tr>))
            }
        </table>
    </div>
  )
}
