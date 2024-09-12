import {createStore} from 'redux';
import myproddata from './reducers/myreducer';
const mystore=createStore(myproddata,{},
    window.__REDUX_DEVTOOLS_EXTENSION__ && window.__REDUX_DEVTOOLS_EXTENSION__()
)

export default mystore;