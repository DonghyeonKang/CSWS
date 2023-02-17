import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";
import BoundRules from "../../components/Instance/SecurityGroup/BoundRules";
import SecurityGroupDetail from "../../components/Instance/SecurityGroup/SecurityGroupDetail";

const SecurityGroup = () => {
  const navigate = useNavigate();
  const {instanceId, securityGroupId} = useParams();
    return (
      <>
        <Header/>
        <Content>
          <div>InstanceId : {instanceId}</div>
          <div>SecurityGroupId : {securityGroupId}</div>
          <button onClick={() => navigate(`/dashboard/${instanceId}`)}>뒤로가기</button>

          <SecurityGroupDetail/>
    
          <BoundRules/>
        </Content>
        
      </>
    );
};

export default SecurityGroup;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
`;