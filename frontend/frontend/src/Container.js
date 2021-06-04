import React from "react";
import axios from "axios";
import {useState, useEffect} from "react";
import active from "./assets/active.png";
import notactive from "./assets/notactive.png";
import styled from "styled-components";

const Wrapper = styled.div`
    display: flex;
    flex-direction: row;
    justify-content: center;
    font-size: 13px;
`

const Context = styled.div `
    display: flex;
    flex-direction: column;
    padding:15px;
`

const Title = styled.div`
    border-bottom: 1px;
    border-bottom-color: var(--point);

a:link{
    color : var(--content);
    text-decoration: none;
}
a:visited{
    text-decoration: none;
    color : var(--content);
}
a:hover  {
    text-decoration: underline;
}
    
`

const Card = styled.div`
img{
    width:255px;
    height:40px;
    margin-bottom:10px;
}


`


function Header() {
    
    //const [data, setData] = useState();

    const url = 'http://localhost:8080';
    axios.get(url).then(response=>{
        console.log(response.data);
    })

    
    return (
        
        <Wrapper>
            <Context>
                <Title><h2><a href=''>새로운 글</a></h2></Title>
                <Card><img src={notactive} style={{height:"77px"}}/></Card>
                <Card><img src={notactive} style={{height:"77px"}}/></Card>
                <Card><img src={notactive} style={{height:"77px"}}/></Card>
                <Card><img src={notactive} style={{height:"77px"}}/></Card>

            </Context>

            <Context>
                <Title><h2><a href=''>추가된 문제</a></h2></Title>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
            </Context>

            <Context>
                <Title><h2><a href=''>추가된 영어문제</a></h2></Title>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
            </Context>

            <Context>
                <Title><h2><a href=''>문제 순위</a></h2></Title>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
                <Card><img src={notactive}/></Card>
            </Context>

            <Context>

            </Context>
        </Wrapper>
    );
    
}

export default Header;