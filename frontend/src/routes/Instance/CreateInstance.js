import { useNavigate } from "react-router-dom";

const CreateInstance = () => {
  const navigate = useNavigate();
    return (
      <>
        <div>CreateInstance</div>
        <button onClick={() => navigate("/dashboard")}>취소</button>
        <button onClick={() => navigate("/dashboard")}>인스턴스 생성</button>
      </>
    );
};

export default CreateInstance;