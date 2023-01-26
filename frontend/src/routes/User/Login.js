import { useNavigate } from "react-router-dom";

const Login = () => {
  const navigate = useNavigate();
    return (
      <>
        <div>Login</div>
        <button onClick={() => navigate('/')}>로그인</button>
        <button onClick={() => navigate('signup')}>회원가입</button>
        <button>비밀번호 변경</button>
      </>
    );
};

export default Login;