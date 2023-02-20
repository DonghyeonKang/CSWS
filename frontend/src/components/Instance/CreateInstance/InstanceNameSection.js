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
  padding: 2%;
  margin-bottom: 5%;
  box-shadow: 2px 2px #dbdfe0;
  background-color: #fafafa;
`;

const Title = styled.div`
  margin-bottom: 5%;
`;