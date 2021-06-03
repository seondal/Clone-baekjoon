import React from "react";
import styled from "styled-components";

const Logo = styled.div`
    background: url(https://d2gd6pc034wcta.cloudfront.net/images/logo@2x.png);
    background-size:contain;
    background-repeat: no-repeat;
    height: 60px;
    width:262px;
`

const Menu = styled.li`
    list-style: none;
    display: table-cell;
    width:10vw;
    text-align: center;
`

function Header() {
    return (
        <ul style={{maxWidth:'1170px', marginLeft:'auto',marginRight:'auto'}}>
            <Menu><Logo/></Menu>
            <Menu>문제</Menu>
            <Menu>문제집</Menu>
            <Menu>대회</Menu>
            <Menu>채점 현황</Menu>
            <Menu>랭킹</Menu>
            <Menu>게시판</Menu>
            <Menu>그룹</Menu>
            <Menu>블로그</Menu>
            <Menu>강의</Menu>
        </ul>
    );
}

export default Header;