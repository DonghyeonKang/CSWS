import { useNavigate, useParams } from "react-router-dom";

const Domain = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();
    return (
      <>
        <div>Domain {instanceId}</div>
        <button onClick={() => navigate(`/dashboard/${instanceId}`)}>도메인 적용</button>
        <button onClick={() => navigate(`/dashboard/${instanceId}`)}>뒤로가기</button>
      </>
    );
};

export default Domain;