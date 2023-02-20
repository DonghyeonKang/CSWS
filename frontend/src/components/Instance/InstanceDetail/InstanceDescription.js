import styled from "styled-components";

const InstanceDescription = () => {
    return (
        <>
            <div>인스턴스 요약</div>
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

const DescriptionContent = styled.div`
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  margin-top: 3%;
  margin-bottom: 5%;
`;

const DescriptionGrid = styled.div`
  width: 315px;
  padding: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid #eaeded;
`