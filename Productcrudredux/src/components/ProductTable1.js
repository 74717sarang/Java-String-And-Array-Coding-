import React,{useEffect} from 'react'
import { useSelector } from 'react-redux'
import ProductForm from './ProductForm'
export default function ProductTable1() {
  console.log("in producttable1 array")
  //get data from redux store 
  var prodarr=useSelector(state=>state.prodarray)
    
 
  return (
    <div>
      <table border='2'>
        <thead>
          <tr>
            <th>Product id</th>
            <th>Product Name</th>
            <th>Quantity</th>
            <th>price</th>
          </tr>
        </thead>
        <tbody>
          {prodarr.map(ob=><tr key={ob.pid}>
              <td>{ob.pid}</td>
              <td>{ob.pname}</td>
              <td>{ob.qty}</td>
              <td>{ob.price}</td>

          </tr>)}
        </tbody>
      </table>
      <div>
        <ProductForm></ProductForm>
      </div>
    </div>
  )
}
