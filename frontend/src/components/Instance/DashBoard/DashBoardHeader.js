import { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const DashBoardHeader = () => {
    const navigate = useNavigate();
    const [IOption, setIOption] = useState(false); //인스턴스 상태 누르면 시작,중지,재부팅,종료 박스 생성/삭제
    return(
        <ContentHeader>
            <Title>인스턴스</Title>
            <Container>
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
              <InstanceCreate onClick={() => navigate('createInstance')}>인스턴스 생성</InstanceCreate>
            </Container>
          </ContentHeader>
    );
};
export default DashBoardHeader;

const ContentHeader = styled.div`
  display: flex;
  justify-content: space-between;
  min-width: 380px;
  max-height: 25px;
  margin: 2% 0;
  font-size: 14px;
`;
const Title = styled.div`
  font-size: 20px;
  font-weight: 600;
`;
const Container = styled.div`
  width: 20vw;
  min-width: 250px;
  display: flex;
  justify-content: space-between;
`;
const InstanceState = styled.div`
  cursor: pointer;
  border: 0.5px solid #879596;
`;
const State = styled.div`
  padding: 2px 12px;
  font-weight: 600;
  background-color: white;
  :hover{
    background-color: #fafafa;
    color: black;
  }
`;
const SetState = styled.div`
  padding: 2px 12px;
  border: 0.5px solid #879596;
  font-weight: 600;
  :hover{
    background-color: #fafafa;
    border: 2px solid #879596;
    color: black;
  }
`;
const InstanceCreate = styled.div`
  cursor: pointer;
  padding: 2px 12px;
  background-color: #ec7211;
  color: white;
  font-weight: 600;
  :hover{
    background-color: #eb5f07;
  }
`