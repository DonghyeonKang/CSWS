import styled from "styled-components";
import Header from "../../components/Header";
import EditInboundRules from "../../components/Instance/InboundRules/EditInboundRules";
import Navigation from "../../components/Navigation";

const InboundRules = () => {
  
    return (
      <>
        <Header/>
        <Content>
          <Navigation/>
          <EditInboundRules/>
        </Content>
        
      </>
    );
};

export default InboundRules;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 70px;
  width: 90%;
`;
