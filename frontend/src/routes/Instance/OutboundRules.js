import styled from "styled-components";
import Header from "../../components/Header";
import EditOutboundRules from "../../components/Instance/OutboundRules/EditOutboundRules";
import Navigation from "../../components/Navigation";

const OutboundRules = () => {
    return (
      <>
        <Header/>
        <Content>
          <Navigation/>
          <EditOutboundRules/>
        </Content>
      </>
    );
};

export default OutboundRules;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 70px;
  width: 90%;
`;