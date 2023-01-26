import { useNavigate, useParams } from "react-router-dom";

const OutboundRules = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();
    return (
      <>
        <div>OutboundRules</div>
        <button onClick={() => navigate(`/dashboard/${instanceId}/securityGroup`)}>뒤로가기(취소)</button>
        <button onClick={() => navigate(`/dashboard/${instanceId}/securityGroup`)}>아웃바운드 규칙 저장</button>
      </>
    );
};

export default OutboundRules;