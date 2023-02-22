import styled from "styled-components";
import Header from "../../components/Header";
import InstanceNameSection from "../../components/Instance/CreateInstance/InstanceNameSection";
import KeyPairSection from "../../components/Instance/CreateInstance/KeyPairSection";
import MachineImageSection from "../../components/Instance/CreateInstance/MachineImageSection";
import StorageSection from "../../components/Instance/CreateInstance/StorageSection";
import Navigation from "../../components/Navigation";

const CreateInstance = () => {
    return (
      <>
        <Header/>
        <Content>
          <Navigation/>
          <Box>
            <InstanceNameSection/>
            <StorageSection/>
            <MachineImageSection/>
            <KeyPairSection/>
          </Box>
        </Content>  
      </>
    );
};

export default CreateInstance;

const Content = styled.div`
  padding: 0 5%;
  padding-top: 70px;
  width: 90%;
`;

const Box = styled.div`
  width: 100%;
  display: flex;
  justify-content: space-between;
  flex-wrap: wrap;
  margin: 5% 0 ;
`;