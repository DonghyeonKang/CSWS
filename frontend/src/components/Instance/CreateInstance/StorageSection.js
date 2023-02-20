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
  padding: 2%;
  margin-bottom: 5%;
  box-shadow: 2px 2px #dbdfe0;
  background-color: #fafafa;
`;

const Title = styled.div`
  margin-bottom: 5%;
`;