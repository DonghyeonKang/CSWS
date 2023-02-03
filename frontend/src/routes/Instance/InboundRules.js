import { useNavigate, useParams } from "react-router-dom";

const InboundRules = () => {
  const navigate = useNavigate();
  const {instanceId, securityGroupId} = useParams();
    return (
      <>
        <div>InboundRules</div>
        <button onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>뒤로가기(취소)</button>
        <button onClick={() => navigate(`/dashboard/${instanceId}/${securityGroupId}`)}>인바운드 규칙 저장</button>
      </>
    );
};

export default InboundRules;