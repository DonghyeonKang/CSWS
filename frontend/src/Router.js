import { BrowserRouter, Routes, Route } from "react-router-dom";
import Main from "./routes/Main";
import Login from "./routes/User/Login"
import SignUp from "./routes/User/SignUp"
import FindPw from "./routes/User/FindPw";
import ChangePw from "./routes/User/ChangePw";
import DashBoard from "./routes/Instance/DashBoard";
import InstanceDetail from "./routes/Instance/InstanceDetail";
import CreateInstance from "./routes/Instance/CreateInstance";
import SecurityGroup from "./routes/Instance/SecurityGroup";
import InboundRules from "./routes/Instance/InboundRules";
import OutboundRules from "./routes/Instance/OutboundRules";


const Router = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" exact element={<Main/>}/>

          <Route path="/login" exact element={<Login/>}/>
            <Route path="/login/signup" exact element={<SignUp/>}/>
            <Route path="/login/findpw" exact element={<FindPw/>}/>
              <Route path="/login/findpw/ChangePw" exact element={<ChangePw/>}/>
          <Route path="/dashboard" exact element={<DashBoard/>}/>
            <Route path="/dashboard/:instanceId" exact element={<InstanceDetail/>}/> 
              <Route path="/dashboard/:instanceId/:securityGroupId" exact element={<SecurityGroup/>}/> 
                <Route path="/dashboard/:instanceId/:securityGroupId/inboundRules" exact element={<InboundRules/>}/> 
                <Route path="/dashboard/:instanceId/:securityGroupId/outboundRules" exact element={<OutboundRules/>}/>

            <Route path="/dashboard/createInstance" exact element={<CreateInstance/>}/>
      </Routes>
    </BrowserRouter>
  );
};

export default Router;