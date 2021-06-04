import React from "react";
import styled from "styled-components";

const Numbox = styled.div`
    color:white;
    display: inline-block;
    border:solid 1px #555;
    padding:15px 0 10px;
`

function Numsummary() {
    const style = {
        backgroundColor: '#252525',
        padding: '60px'
    }
    return (
    <div style={style}>
        <Numbox>전체 문제</Numbox>
        <Numbox>채점 가능한 문제</Numbox>
        <Numbox>풀린 문제</Numbox>
        <Numbox>채점 가능한 언어</Numbox>
    </div>
    );
}

export default Numsummary;