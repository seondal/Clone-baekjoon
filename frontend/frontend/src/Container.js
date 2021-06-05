import React from "react";
import axios from "axios";
import {useState, useEffect} from "react";
import {useHistory} from "react-router-dom";
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


function Container() {
    //문제 순위
    const [rankdata, setRankdata] = useState();
    useEffect(async () => {
        try{
            const response=await axios.get(`http://localhost:8080/problem/sort/rank`);
            setRankdata(response.data); //데이터 저장
        } catch(e) {
            console.log("error");
        }
    }, []);

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
                {rankdata?.map((item) => (
                    <Card>
                        <a href="" style={{position:'absolute', color:'#333', fontSize:'15px', margin:'10px', textDecoration:'none'}}>
                            {item.id}번 {item.title}
                        </a>
                        <img src={notactive}/>
                    </Card>
                ))}
            </Context>

            <Context>

            </Context>
        </Wrapper>
    );
    
}

export default Container;