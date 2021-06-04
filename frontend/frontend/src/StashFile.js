import React from "react";
import styled from "styled-components";
import axios from "axios";
import { useState, useEffect } from "react";
import active from "./assets/active.png";
import notactive from "./assets/notactive.png";

const Wrapper = styled.div`
display: flex;
flex-direction: row;
justify-content: center;
font-size: 13px;
`

const Context = styled.div`
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
width:255px;
height: 200px;
padding: 15px;
margin-bottom: 10px;

background : url(${notactive});
background-size : 100%;
background-repeat: no-repeat;

:hover{
width:255px;
height: auto;
padding: 10px;
background : url(${active});
background-size : 100%;
margin-bottom: 10px;
background-repeat: no-repeat;
}
`


function Header() {

    //const [data, setData] = useState();

    //useEffect(async() =>{
    //try {
    //const response = await axios.get(`http://localhost:8080`);
    //setData(response.data);
    //console.log(response);
    //}
    //},[]);


    return (

        <Wrapper>
            {/* <Context>
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

            </Context> */}
            <Card>hellohelloaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa</Card>
        </Wrapper>
    );

}

export default Header;