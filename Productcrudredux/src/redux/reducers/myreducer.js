import {combineReducers} from 'redux';
import { manageProductarray } from './productreducers';

const myproddata=combineReducers({
    prodarray:manageProductarray
})

export default myproddata;