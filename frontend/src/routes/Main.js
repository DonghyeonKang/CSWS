import { useNavigate } from "react-router-dom";
import { useRecoilState } from "recoil";
import styled from "styled-components";
import { loginState } from "../Atoms";
import Header from '../components/Header';

const Main = () => {
  const navigate = useNavigate();
  const [,setState] = useRecoilState(loginState);
    return (
      <>
        <Header/>
        <Content>
          <div>Main</div>
          <button onClick={() => navigate('login')}>로그인</button>
          <button onClick={() => navigate('dashboard')}>대시보드</button>
          <button onClick={()=> setState(0)}>로그아웃</button>
        </Content>
      </>
    );
};

export default Main;

const Content = styled.div`
  padding-top: 10vh;
`;