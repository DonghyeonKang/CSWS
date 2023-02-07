import { useNavigate } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";

const CreateInstance = () => {
  const navigate = useNavigate();
    return (
      <>
        <Header/>
        <Content>
          <div>인스턴스 생성</div>
          <Top>
            <Name>
              <div>인스턴스 이름</div>
              <input/>
            </Name>
            <Storage>
              <div>스토리지 구성</div>
              <select>
                <option>스토리지 구성 정보</option>
              </select>
            </Storage>
          </Top>
          <Bottom>
            <OS>
              <div>운영체제 종류</div>
              <OSImg>
                <OSSelect>우분투</OSSelect>
                <OSSelect>CentOS</OSSelect>
              </OSImg>
              <select>
                <option>운영체제 버전</option>
              </select>
            </OS>
            <KeyPair>
              <div>키페어</div>
              <div style={{display:'flex', justifyContent:'space-between'}}>
                <input style={{width:'60%'}}/>
                <span>새 키페어 생성</span>
              </div>
            </KeyPair>
          </Bottom>
          
          <Btn>
            <button onClick={() => navigate("/dashboard")}>취소</button>
            <button onClick={() => navigate("/dashboard")}>인스턴스 생성</button> 
          </Btn>
          
        </Content>  
      </>
    );
};

export default CreateInstance;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
  width: 90%;
`;
const Box = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 40%;
  border: 1px solid black;
  padding: 2%;
`;
const Name = styled(Box)``;
const Storage = styled(Box)``;
const OS = styled(Box)``;
const KeyPair = styled(Box)``;

const Top = styled.div`
  width: 100%;
  display: flex;
  justify-content: space-between;
  margin: 5% 0 ;
`;

const Bottom = styled.div`
  width: 100%;
  display: flex;
  justify-content: space-between;
  margin: 5% 0;
`;

const OSImg = styled.div`
  display: flex;
  justify-content: space-evenly;
  margin: 4% 0;
`;

const OSSelect = styled.div`
  border: 1px solid black;
  width: 5vw;
  height: 10vh;
  display: flex;
  justify-content: center;
  align-items: center;
`;

const Btn = styled.div`
  display: flex;
  justify-content: end;
`;