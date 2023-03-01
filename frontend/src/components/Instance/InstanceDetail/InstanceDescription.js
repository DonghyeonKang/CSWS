import styled from "styled-components";

const InstanceDescription = () => {
    return (
        <>
            <Title>인스턴스 요약</Title>
            <DescriptionContent>
                <DescriptionGrid>인스턴스 ID</DescriptionGrid>
                <DescriptionGrid>퍼블릭 IPv4 주소</DescriptionGrid>
                <DescriptionGrid>인스턴스 상태</DescriptionGrid>
                <DescriptionGrid>퍼블릭 IPv4 DNS</DescriptionGrid>
                <DescriptionGrid>자동 할당 IP 주소(퍼블릭 IP)</DescriptionGrid>
            </DescriptionContent>
        </>
        
    );
};

export default InstanceDescription;

const Title = styled.div`
  background-color: #fafafa;
  min-width: 900px;
  padding: 1%;
  border: 1px solid #eaeded;
  font-size: 20px;
  font-weight: 600;
`;

const DescriptionContent = styled.div`
  display: grid;
  grid-template-columns: repeat(3,33%);
  grid-auto-flow: row;
  gap: 0.5%;
  row-gap: 5px;
  width: 100%;
  min-width: 900px;
  margin-bottom: 5%;
  background-color: white;
`;

const DescriptionGrid = styled.div`
  width: 100%;
  min-width: 300px;
  height: 50px;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: white;
`