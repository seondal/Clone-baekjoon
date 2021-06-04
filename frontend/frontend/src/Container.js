import React from "react";
import axios from "axios";
import {useState, useEffect} from "react";

function Header() {
    const [data, setData] = useState();

    const url = 'http://localhost:8080';
    axios.get(url).then(response=>{
        console.log(response.data);
    })

    return (
        <div>
            useEffect Contaner ~
        </div>
    );
}

export default Header;