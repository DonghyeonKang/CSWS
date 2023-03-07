import { useNavigate } from "react-router-dom";
import { useRecoilState } from "recoil";
import styled from "styled-components";
import { loginState } from "../Atoms";
import Header from "../components/Header";
import Slider from "react-slick";
import "slick-carousel/slick/slick.css";
import "slick-carousel/slick/slick-theme.css";
import ArrowBackIosIcon from '@mui/icons-material/ArrowBackIos';
import ArrowForwardIosIcon from '@mui/icons-material/ArrowForwardIos';
const Pre = styled.div`
  width: 30px;
  height: 30px;
  position: absolute;
  left: 3%;
  z-index: 3;
`;

const NextTo = styled.div`
  width: 30px;
  height: 30px;
  position: absolute;
  right: 3%;
  z-index: 3;
`;

const Main = () => {
  const navigate = useNavigate();
  const [, setState] = useRecoilState(loginState);
  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
    autoplay: true,
    nextArrow: (
      <NextTo>
        <ArrowBackIosIcon/>
      </NextTo>
    ),
    prevArrow: (
      <Pre>
        <ArrowForwardIosIcon/>
      </Pre>
    ),
  };

  return (
    <>
      <Header />
      <Content>
        <div>Main</div>
        <button onClick={() => navigate("login")}>로그인</button>
        <button onClick={() => navigate("dashboard")}>대시보드</button>
        <button onClick={() => setState(0)}>로그아웃</button>
      </Content>

      <SliderWrapper>
        <Slider {...settings}>
          <div>
            <h2>1</h2>
          </div>
          <div>
            <h3>2</h3>
          </div>
          <div>
            <h3>3</h3>
          </div>
        </Slider>
      </SliderWrapper>
    </>
  );
};

export default Main;

const Content = styled.div`
  padding-top: 10vh;
`;

const SliderWrapper = styled.div`
  width: 95%;
  margin : 0 auto;
`;
