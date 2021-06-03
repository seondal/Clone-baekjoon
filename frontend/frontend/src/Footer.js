import React from "react";
import styled from "styled-components";
import './Footer.css';

const FooterWrapper = styled.div`
    display: flex;
    flex-direction: row;
    align-content: flex-end;
    justify-content : center;
    background: #252525;
`

const FooterContent = styled.div`
    display : flex;
    padding-top : 30px;
    flex-direction: column;
    width: 400px;
`

function Footer() {
    return (
        <FooterWrapper>
            <FooterContent>
                <h4 style={{ color: "white" }}>Baekjoon Online Judge </h4>
                <a href="">소개</a>
                <a href="">뉴스</a>
                <a href="">생중계</a>
                <a href="">설문조사</a>
                <a href="">블로그</a>
                <a href="">캘린더</a>
                <a href="">기부하기</a>
                <a href="">기능추가요청</a>
                <a href="">스페셜저지제작</a>
                <a href="">실험실</a>

                <div></div>

                <h4 style={{ color: "white" }}> 채점현황 </h4>
                <a href="">채점현황</a>
            </FooterContent>

            <FooterContent>
                <h4 style={{ color: "white" }}>문제</h4>
                <a href="">문제</a>
                <a href="">단계별로 풀어보기</a>
                <a href="">알고리즘 분류</a>
                <a href="">새로 추가된 문제</a>
                <a href="">새로 추가된 영어문제</a>
                <a href="">문제 순위</a>
                <a href="">최근 제출된 문제</a>
                <a href="">최근 풀린 문제</a>
                <a href="">재채점 및 문제 수정</a>
                <div></div>

                <h4 style={{ color: "white" }}> 유저 대회 / 고등학교 대회 </h4>
                <a href="">FunctionCup Good Bye, BOJ kriicon</a>
                <a href="">구데기컵 꼬마컵 네블컵 소프트콘 웰노운컴</a>
                <a href="">키파컵 폴리매스 코드 챔피언십 HYEA CUP</a>
                <a href="">경기과학고등학교 대구과학고등학교</a>
                <a href="">부산일과학교 서울과학고등학교</a>
                <a href="">선린인터넷고등학교</a>

            </FooterContent>

            <FooterContent>
                <h4 style={{ color: "white" }}> 출처 </h4>
                <a href="">ICPC</a>
                <a href="">ICPC Korea Regional</a>
                <a href="">Olympiad</a>
                <a href="">한국정보올림피아드</a>
                <a href="">한국정보올림피아드 시.도 지역본선</a>
                <a href="">카카오 코드 페스티벌</a>
                <a href="">Coder's High</a>
                <a href="">Open Cup</a>
                <a href="">Petrozavodsk Programming Camp</a>

                <h4 style={{ color: "white" }}> 대학교 대회 </h4>
                <a href="">KAIST POSTECH UNIST 가톨릭대학교</a>
                <a href="">강원대학교 건국대학교 경북대학교 고려대학교</a>
                <a href="">광주과학기술원 국민대학교 서강대학교</a>
                <a href="">서울대학교 성균관대학교 숭실대학교</a>
                <a href="">아주대학교 연세대학교 인천대학교 인하대학교</a>
                <a href="">이화여자대학교</a>
                <a href="">전북대학교 중앙대학교 충남대학교</a>
                <a href="">한양대 ERICA 한양대학교 홍익대학교</a>
                <a href="">경인지역 6개대학 연합 프로그래밍 경시대회</a>
                <a href="">전국 대학생 프로그래밍 대회 동아리 연합</a>
            </FooterContent>

            <FooterContent>
                <h4 style={{ color: "white" }}> 대학교 대회 </h4>
                <a href="">채점 도움말 및 채점 환경</a>
                <a href="">재채점 안내</a>
                <a href="">런타임 에러 도움말</a>
                <a href="">문제 스타일 안내</a>
                <a href="">컴파일 또는 실행 옵션, 컴파일러버전, 언어 도움말</a>
                <a href="">문제집 도움말</a>
                <a href="">대회 개최 안내</a>
                <a href="">문제 출제 안내</a>
                <a href="">이용 규칙</a>
                <a href="">통계 도움말</a>
                <a href="">질문 도움말</a>
                <a href="">자주묻는 질문</a>
                <a href="">강의 안내</a>
                <a href="">짧은 주소 안내</a>
                <a href="">광고 안내</a>
            </FooterContent>
        </FooterWrapper>
    );
}

export default Footer;