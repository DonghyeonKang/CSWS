import { useNavigate, useParams } from "react-router-dom";

const SecurityGroup = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();
    return (
      <>
        <div>SecurityGroup</div>
        <button onClick={() => navigate(`/dashboard/${instanceId}`)}>뒤로가기</button>
        <button onClick={() => navigate('inboundRules')}>인바운드 규칙 편집</button>
        <button onClick={() => navigate('outboundRules')}>아웃바운드 규칙 편집</button>
      </>
    );
};

export default SecurityGroup;