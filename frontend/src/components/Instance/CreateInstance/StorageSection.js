import styled from "styled-components";

const StorageSection = () => {
    return (
        <Storage>
            <Title>스토리지 구성</Title>
            <select>
                <option>스토리지 구성 정보</option>
            </select>
        </Storage>
    );
};

export default StorageSection;

const Storage = styled.div`
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