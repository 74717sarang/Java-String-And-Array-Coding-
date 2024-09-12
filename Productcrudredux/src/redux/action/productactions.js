export const setdata=(prodarr)=>{
    return{
        type:"set_data",
        payload: prodarr
    }

}

export const adddata=(product)=>{
    return{
        type:"add_data",
        payload: product
    }

}