import styled from "styled-components";
import { useNavigate } from "react-router-dom";
import { useRecoilValue } from "recoil";
import { loginState } from "../Atoms";

const Header = () => {
  const isLoggedIn = useRecoilValue(loginState);
  const navigate = useNavigate();
  return (
    <HeaderContent>
      <HeaderLogo src="." onClick={() => navigate('/')}/>
      {(isLoggedIn === 0) ? <HeaderBtn onClick={() => navigate('/login')}>로그인</HeaderBtn> : 
      <HeaderBtn onClick={() => navigate('/dashboard')}>대시보드</HeaderBtn>
      }
    </HeaderContent>
  );
};

export default Header;

const HeaderContent = styled.div`
  display: flex;
  position: fixed;
  top: 0;
  left: 0;
  justify-content: space-between;
  align-items: center;
  width: 97vw;
  height: 35px;
  padding: 1% 2%;
  background-color: #232f3e;
  color: white;
`;

const HeaderLogo = styled.img`
  width: 75px;
  height: 30px;
  border: 1px white solid;
`;

const HeaderBtn = styled.button`
  width: 100px;
  height: 30px;
  font-size: 16px;
  color: white;
  background-color: #ec7211;
  border: 2px #ec7211 solid;
  border-radius: 5vh;
  margin-right: 20px;
  :hover{
    background-color: #eb5f07;
  }
`;