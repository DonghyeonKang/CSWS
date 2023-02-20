import { useLocation, useNavigate, useParams } from "react-router-dom";
import styled from "styled-components";

const Navigation = () => {
    const param = useParams();
    const navigate = useNavigate();
    const location = useLocation();
    console.log(param, location.pathname.split('/'));
    return (
        <>
            <Nav>
                <Link onClick={() => navigate('/dashboard')}>대시보드</Link>
                {location.pathname.split('/')[2] ? 
                (<>
                    <span> ❯ </span>
                    {location.pathname.split('/')[2] === 'createInstance' ? <span>인스턴스 생성</span> : (
                        <Link onClick={() => navigate(`/dashboard/${param?.instanceId}`)}>{location.pathname.split('/')[2]}</Link>)
                        }
                </>)
                 : (<></>)}
                 {location.pathname.split('/')[3] ? 
                (<>
                    <span> ❯ </span>
                    <Link onClick={() => navigate(`/dashboard/${param?.instanceId}/${param?.securityGroupId}`)}>{location.pathname.split('/')[3]}</Link>
                </>)
                 : (<></>)}
                 {location.pathname.split('/')[4] ? 
                (<>
                    <span> ❯ </span>
                    <span>{location.pathname.split('/')[4] === 'inboundRules' ? '인바운드 규칙' : '아웃바운드 규칙'}</span>
                </>)
                 : (<></>)}
            </Nav>
        </>
    );
};

export default Navigation;

const Nav = styled.div`
    margin-bottom: 2%;
`;

const Link = styled.span`
    cursor: pointer;
    :hover{
        text-decoration: underline;
    }
`;