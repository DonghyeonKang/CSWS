import { BrowserRouter, Routes, Route } from "react-router-dom";
import Main from "./routes/Main";
import Login from "./routes/User/Login"
import SignUp from "./routes/User/SignUp"
import DashBoard from "./routes/Instance/DashBoard";
import InstanceDetail from "./routes/Instance/InstanceDetail";
import CreateInstance from "./routes/Instance/CreateInstance";
import SecurityGroup from "./routes/Instance/SecurityGroup";
import Domain from "./routes/Instance/Domain";
import InboundRules from "./routes/Instance/InboundRules";
import OutboundRules from "./routes/Instance/OutboundRules";

const Router = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" exact element={<Main/>}/>

          <Route path="/login" exact element={<Login/>}/>
            <Route path="/login/signup" exact element={<SignUp/>}/>

          <Route path="/dashboard" exact element={<DashBoard/>}/>
            <Route path="/dashboard/:instanceId" exact element={<InstanceDetail/>}/> 
              <Route path="/dashboard/:instanceId/securityGroup" exact element={<SecurityGroup/>}/> 
                <Route path="/dashboard/:instanceId/securityGroup/inboundRules" exact element={<InboundRules/>}/> 
                <Route path="/dashboard/:instanceId/securityGroup/outboundRules" exact element={<OutboundRules/>}/> 

              <Route path="/dashboard/:instanceId/domain" exact element={<Domain/>}/> 

            <Route path="/dashboard/createInstance" exact element={<CreateInstance/>}/>
      </Routes>
    </BrowserRouter>
  );
};

export default Router;