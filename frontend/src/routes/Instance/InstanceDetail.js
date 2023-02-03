import { useNavigate, useParams } from "react-router-dom";

const InstanceDetail = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();//임시 인스턴스 ID
    return (
      <>
        <div>InstanceDetail {instanceId}</div>
        <button onClick={() => navigate('/dashboard')}>뒤로가기</button>
        <button onClick={() => navigate(`${Date.now()}`)}>보안 그룹</button>
      </>
    );
};

export default InstanceDetail;