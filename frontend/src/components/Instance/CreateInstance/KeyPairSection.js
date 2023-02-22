import { useNavigate } from "react-router-dom";
import styled from "styled-components";

const KeyPairSection = () => {
  const navigate = useNavigate();
    return (
      <>
        <KeyPair>
            <Title>키페어</Title>
            <div style={{display:'flex', justifyContent:'space-between'}}>
            <input style={{width:'60%'}}/>
            <span>새 키페어 생성</span>
            </div>
        </KeyPair>
        <Btn>
            <Cancel onClick={() => navigate("/dashboard")}>취소</Cancel>
            <Create onClick={() => navigate("/dashboard")}>인스턴스 생성</Create> 
        </Btn>
      </> 
    );
};

export default KeyPairSection;

const KeyPair = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 40%;
  min-width: 400px;
  padding: 2%;
  height: 50%;
  margin-bottom: 13%;
  box-shadow: 2px 2px #dbdfe0;
  background-color: #fafafa;
`;

const Title = styled.div`
  margin-bottom: 5%;
`;

const Btn = styled.div`
  width: 100vw;
  height: 5vh;
  display: flex;
  justify-content: end;
  align-items: flex-end;
  margin-top: -8%;
`;

const Create = styled.div`
  cursor: pointer;
  margin-left: 20px;
  padding: 2px 12px;
  background-color: #ec7211;
  color: white;
  :hover{
    background-color: #eb5f07;
  }
`;

const Cancel = styled.div`
  cursor: pointer;
  padding: 2px 12px;
  :hover{
    background-color: white;
  }
`;