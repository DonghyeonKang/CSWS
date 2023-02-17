import styled from "styled-components";

const SecurityGroupDetail = () => {
    return (
        <>
            <div>세부정보</div>
            <DetailContent>
                <DetailGrid>보안 그룹 이름</DetailGrid>
                <DetailGrid>보안 그룹 ID</DetailGrid>
                <DetailGrid>설명(이름, 생성일자)</DetailGrid>
                <DetailGrid>소유자</DetailGrid>
                <DetailGrid>인바운드 규칙 수</DetailGrid>
                <DetailGrid>아웃바운드 규칙 수</DetailGrid>
            </DetailContent>
        </>
        
    );
};

export default SecurityGroupDetail;

const DetailContent = styled.div`
  display: flex;
  flex-wrap: wrap;
  width: 100%;
  margin-bottom: 5%;
`;
const DetailGrid = styled.div`
  width: 315px;
  padding: 2%;
  display: flex;
  justify-content: center;
  align-items: center;
  border: 1px solid black;
`;