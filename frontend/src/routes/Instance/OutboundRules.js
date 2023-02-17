import styled from "styled-components";
import Header from "../../components/Header";
import EditOutboundRules from "../../components/Instance/OutboundRules/EditOutboundRules";

const OutboundRules = () => {
    return (
      <>
        <Header/>
        <Content>
          <EditOutboundRules/>
        </Content>
      </>
    );
};

export default OutboundRules;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
  width: 90%;
`;