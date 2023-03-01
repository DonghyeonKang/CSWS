import { useState } from "react";
import styled from "styled-components";

const InstanceDescription = () => {
  const [IOption, setIOption] = useState(false);
    return (
        <>
            <DetailHeader>
              <Title>인스턴스 요약</Title>
              <InstanceState>
                <State onClick={()=>{setIOption((prev)=>!prev)}}>{IOption ? '인스턴스 상태 ▲' : '인스턴스 상태 ▼'}</State>
                {IOption ? (
                  <div style={{position:'absolute', backgroundColor:'white'}}>
                    <SetState onClick={()=>{setIOption((prev)=>!prev)}}>인스턴스 시작</SetState>
                    <SetState onClick={()=>{setIOption((prev)=>!prev)}}>인스턴스 중지</SetState>
                    <SetState onClick={()=>{setIOption((prev)=>!prev)}}>인스턴스 재부팅</SetState>
                    <SetState onClick={()=>{setIOption((prev)=>!prev)}}>인스턴스 종료</SetState>
                  </div>) : (<></>)}
              </InstanceState>
            </DetailHeader>
            
            <DescriptionContent>
                <DescriptionGrid>인스턴스 ID</DescriptionGrid>
                <DescriptionGrid>퍼블릭 IPv4 주소</DescriptionGrid>
                <DescriptionGrid>인스턴스 상태</DescriptionGrid>
                <DescriptionGrid>퍼블릭 IPv4 DNS</DescriptionGrid>
                <DescriptionGrid>자동 할당 IP 주소(퍼블릭 IP)</DescriptionGrid>
            </DescriptionContent>
        </>
        
    );
};

export default InstanceDescription;

const DetailHeader = styled.div`
  display: flex;
  align-items: center;
  background-color: #fafafa;
  border: 1px solid #eaeded;
  width: 100%;
  min-width: 1150px;
`;

const Title = styled.div`
  width: 85%;
  min-width: 900px;
  padding: 1%;
  font-size: 20px;
  font-weight: 600;
`;

const InstanceState = styled.div`
  cursor: pointer;
  border: 0.5px solid #879596;
  margin-right: 2%;
  min-width: 190px;
`;
const State = styled.div`
  padding: 4px 15px;
  font-weight: 600;
  background-color: white;
  &:hover{
    background-color: #fafafa;
    color: black;
  }
`;
const SetState = styled.div`
  padding: 2px 12px;
  border: 0.5px solid #879596;
  font-weight: 600;
  &:hover{
    background-color: #fafafa;
    border: 2px solid #879596;
    color: black;
  }
`;

const DescriptionContent = styled.div`
  display: grid;
  grid-template-columns: repeat(3,33%);
  grid-auto-flow: row;
  gap: 0.5%;
  row-gap: 5px;
  width: 100%;
  min-width: 1150px;
  margin-bottom: 5%;
  background-color: white;
`;

const DescriptionGrid = styled.div`
  width: 100%;
  min-width: 300px;
  height: 50px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: white;
`