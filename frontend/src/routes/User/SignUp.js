import { useNavigate } from "react-router-dom";

const SignUp = () => {
    const navigate = useNavigate();
    return (
      <>
        <div>SignUp</div>
        <button onClick={() => navigate('/login')}>회원가입</button>
      </>
    );
};

export default SignUp;