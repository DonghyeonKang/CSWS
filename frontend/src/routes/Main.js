import { useNavigate } from "react-router-dom";

const Main = () => {
  const navigate = useNavigate();
    return (
      <>
        <div>Main</div>
        <button onClick={() => navigate('login')}>로그인</button>
        <button onClick={() => navigate('dashboard')}>대시보드</button>
      </>
    );
};

export default Main;