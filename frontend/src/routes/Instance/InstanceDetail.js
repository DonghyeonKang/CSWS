import { useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";
import Header from "../../components/Header";
import InstanceDescription from "../../components/Instance/InstanceDetail/InstanceDescription";
import TabsContent from "../../components/Instance/InstanceDetail/TabsContent";

const InstanceDetail = () => {
  const navigate = useNavigate();
  const {instanceId} = useParams();//임시 인스턴스 ID
    return (
      <>
        <Header/>
        <Content>
          <div>InstanceDetail {instanceId}</div>
          <button onClick={() => navigate('/dashboard')}>뒤로가기</button>
          
          <InstanceDescription/>

          <TabsContent/>
        </Content>
      </>
    );
};

export default InstanceDetail;
const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
`;