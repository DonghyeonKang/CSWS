import { useNavigate } from "react-router-dom";

const DashBoard = () => {
  const navigate = useNavigate();
    return (
      <>
        <div>DashBoard</div>
        <button onClick={() => navigate('createInstance')}>인스턴스 생성</button>
        <button onClick={() => navigate(`${Date.now()}`)}>인스턴스 상세</button>{/*임시 인스턴스 ID 생성*/}
      </>
    );
};

export default DashBoard;