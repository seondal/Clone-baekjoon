import React from "react";
import styled from "styled-components";
import { useSpring, animated } from 'react-spring'

const Numbox = styled.div`
    color:white;
    display: inline-block;
    border:solid 1px #555;
    text-align:center;
    padding:15px 50px 15px 50px;
    margin:10px;
`

function Numsummary() {
    const count1 = useSpring({ from: { val: 0 }, to: { val: 20918 } });
    const count2 = useSpring({ from: { val: 0 }, to: { val: 19400 } });
    const count3 = useSpring({ from: { val: 0 }, to: { val: 16188 } });
    const count4 = useSpring({ from: { val: 0 }, to: { val: 75 } });
    
    const style = {
        backgroundColor: '#252525',
        padding: '60px',
        textAlign: 'center'
    }

    return (
    <div style={style}>
        <Numbox>
            <animated.div style={{fontSize:'42px'}}>
                {count1.val.interpolate(val => Math.floor(val))}
            </animated.div>
            전체 문제
        </Numbox>
        <Numbox>
            <animated.div style={{fontSize:'42px'}}>
                {count2.val.interpolate(val => Math.floor(val))}
            </animated.div>
            채점 가능한 문제
        </Numbox>
        <Numbox>
            <animated.div style={{fontSize:'42px'}}>
                {count3.val.interpolate(val => Math.floor(val))}
            </animated.div>
            풀린 문제
        </Numbox>
        <Numbox>
            <animated.div style={{fontSize:'42px'}}>
                {count4.val.interpolate(val => Math.floor(val))}
            </animated.div>
            채점 가능한 언어
        </Numbox>
    </div>
    );
}

export default Numsummary;