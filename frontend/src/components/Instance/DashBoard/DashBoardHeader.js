import { useState } from "react";
import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const DashBoardHeader = () => {
    const navigate = useNavigate();
    const [IOption, setIOption] = useState(false); //인스턴스 상태 누르면 시작,중지,재부팅,종료 박스 생성/삭제
    return(
        <ContentHeader>
            <div>인스턴스</div>
            <Container>
              <InstanceState>
                <div onClick={()=>{setIOption((prev)=>!prev)}}>인스턴스 상태</div>
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
  margin: 2% 0;
`;
const Container = styled.div`
  width: 20vw;
  display: flex;
  justify-content: space-between;
`;
const InstanceState = styled.div`
  border: 1px solid black;
`;
const SetState = styled.div`
  border: 1px solid black;
`;
const InstanceCreate = styled.button`
  max-height: 23px;
`