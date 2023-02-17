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
            <button onClick={() => navigate("/dashboard")}>취소</button>
            <button onClick={() => navigate("/dashboard")}>인스턴스 생성</button> 
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
  border: 1px solid black;
  padding: 2%;
  height: 50%;
  margin-bottom: 13%;
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