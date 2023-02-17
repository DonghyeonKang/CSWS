import { useState } from "react";
import styled from "styled-components";

const InstanceNameSection = () => {
    const [, setName] = useState();
    return (
        <Name>
            <Title>인스턴스 이름</Title>
            <input onChange={(i)=>setName(i.target.value)}/>
        </Name>
    );
};

export default InstanceNameSection;

const Name = styled.div`
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