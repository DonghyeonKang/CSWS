import { useState } from "react";
import styled from "styled-components";

const MachineImageSection = () => {
    const [, setOs] = useState();
    return (
        <OS>
            <Title>운영체제 종류</Title>
            <OSTabs>
            <OSTab onClick={()=>setOs('Ubuntu')}>우분투</OSTab>
            <OSTab onClick={()=>setOs('CentOs')}>CentOS</OSTab>
            </OSTabs>
            <select>
                <option>운영체제 버전</option>
            </select>
        </OS>
    );
};

export default MachineImageSection;

const OS = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  width: 40%;
  min-width: 400px;
  border: 1px solid black;
  padding: 2%;
  margin-bottom: 5%;
`;

const Title = styled.div`
  margin-bottom: 5%;
`;

const OSTabs = styled.div`
  display: flex;
  justify-content: space-evenly;
  margin: 4% 0;
`;

const OSTab = styled.div`
  border: 1px solid black;
  width: 5vw;
  min-width: 60px;
  height: 10vh;
  display: flex;
  justify-content: center;
  align-items: center;
`;