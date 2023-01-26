import { useNavigate, useParams } from "react-router-dom";

const InboundRules = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();
    return (
      <>
        <div>InboundRules</div>
        <button onClick={() => navigate(`/dashboard/${instanceId}/securityGroup`)}>뒤로가기(취소)</button>
        <button onClick={() => navigate(`/dashboard/${instanceId}/securityGroup`)}>인바운드 규칙 저장</button>
      </>
    );
};

export default InboundRules;