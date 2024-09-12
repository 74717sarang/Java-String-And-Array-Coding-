import axios from 'axios'

var baseUrl="http://localhost:8282/products";
class ProductService{
    getAllProducts(){
       return axios.get(baseUrl);
    }
}
export default new ProductService();