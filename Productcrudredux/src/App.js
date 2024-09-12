import logo from './logo.svg';
import './App.css';
import {useEffect} from 'react'
import {useDispatch} from 'react-redux'
import ProductTable1 from "./components/ProductTable1"
import ProductService from './service/ProductService'
import {setdata} from './redux/action/productactions'
function App() {
  //use to dispatch the action
  const dispatch=useDispatch();
  useEffect(()=>{
    //send request to web service and store data in redux store
   ProductService.getAllProducts()
   .then((result)=>{
    //create a action set_data
    var action=setdata(result.data)
    //send it to redux store to load the array in the store
    dispatch(action);
   })
   .catch((err)=>{})
  },[])
  return (
    <div>
       <h1>Product manangement using redux</h1>
       <ProductTable1></ProductTable1>
    </div>
  );
}

export default App;
