import styled from "styled-components";
import DashBoardHeader from "../../components/Instance/DashBoard/DashBoardHeader";
import Header from "../../components/Header";
import InstanceList from "../../components/Instance/DashBoard/InstanceList";

const DashBoard = () => {
    return (
      <>
        <Header/>
        <Content>
          <div>DashBoard</div>
          <DashBoardHeader/>
          <InstanceList/>
        </Content>
      </>
    );
};

export default DashBoard;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 10vh;
`;

