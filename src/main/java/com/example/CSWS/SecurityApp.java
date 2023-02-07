package com.example.CSWS;

import com.example.CSWS.dashboard.security.BoundPolicy;
import com.example.CSWS.dashboard.security.BoundPolicyService;
import com.example.CSWS.dashboard.security.SecurityGroup;
import com.example.CSWS.dashboard.security.SecurityGroupService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SecurityApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SecurityGroupService securityGroupService = applicationContext.getBean("securityGroupService", SecurityGroupService.class);
        BoundPolicyService boundPolicyService = applicationContext.getBean("boundPolicyService", BoundPolicyService.class);

        BoundPolicy inbound = new BoundPolicy("temp", "ssh", "tcp", "9998", "random");
        BoundPolicy outbound = new BoundPolicy("temp", "ftp", "tcp", "9999", "random");
        SecurityGroup s1 = new SecurityGroup("temp", "tmp", "for test", "test", 1, 1);

        securityGroupService.createSecurityGroup("temp", s1);
        System.out.println(securityGroupService.findSecurityGroup("temp"));

        boundPolicyService.saveInboundPolicy(inbound);
        boundPolicyService.saveOutboundPolicy(outbound);

        List<BoundPolicy> inbounds = boundPolicyService.findAllInboundPolicy("temp");
        List<BoundPolicy> outbounds = boundPolicyService.findAllOutboundPolicy("temp");

        for (BoundPolicy in : inbounds) {
            System.out.println("In" + in);
        }
        for (BoundPolicy out : outbounds) {
            System.out.println("Out" + out);
        }

        System.out.println("result=" + boundPolicyService.deleteInboundPolicy("temp", inbound));
        System.out.println("result=" + boundPolicyService.deleteOutboundPolicy("temp", outbound));

        List<BoundPolicy> inbounds2 = boundPolicyService.findAllInboundPolicy("temp");
        List<BoundPolicy> outbounds2 = boundPolicyService.findAllOutboundPolicy("temp");

        if (inbounds2.isEmpty() && outbounds2.isEmpty()) {
            System.out.println("deleted");
        }
    }

}
