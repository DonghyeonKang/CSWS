package com.example.CSWS;

import com.example.CSWS.dto.BoundPolicyDto;
import com.example.CSWS.service.boundPolicy.BoundPolicyService;
import com.example.CSWS.dto.SecurityGroupDto;
import com.example.CSWS.service.securityGroup.SecurityGroupService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SecurityApp {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigTest1.class);
        SecurityGroupService securityGroupService = applicationContext.getBean("securityGroupService", SecurityGroupService.class);
        BoundPolicyService boundPolicyService = applicationContext.getBean("boundPolicyService", BoundPolicyService.class);

        BoundPolicyDto inbound = new BoundPolicyDto("temp", "ssh", "tcp", "9998", "random");
        BoundPolicyDto outbound = new BoundPolicyDto("temp", "ftp", "tcp", "9999", "random");
        SecurityGroupDto s1 = new SecurityGroupDto("temp", "tmp", "for test", "test", 1, 1);

        securityGroupService.createSecurityGroup("temp", s1);
        System.out.println(securityGroupService.findSecurityGroup("temp"));

        boundPolicyService.saveInboundPolicy(inbound);
        boundPolicyService.saveOutboundPolicy(outbound);

        List<BoundPolicyDto> inbounds = boundPolicyService.findAllInboundPolicy("temp");
        List<BoundPolicyDto> outbounds = boundPolicyService.findAllOutboundPolicy("temp");

        for (BoundPolicyDto in : inbounds) {
            System.out.println("In" + in);
        }
        for (BoundPolicyDto out : outbounds) {
            System.out.println("Out" + out);
        }

        System.out.println("result=" + boundPolicyService.deleteInboundPolicy("temp", inbound));
        System.out.println("result=" + boundPolicyService.deleteOutboundPolicy("temp", outbound));

        List<BoundPolicyDto> inbounds2 = boundPolicyService.findAllInboundPolicy("temp");
        List<BoundPolicyDto> outbounds2 = boundPolicyService.findAllOutboundPolicy("temp");

        if (inbounds2.isEmpty() && outbounds2.isEmpty()) {
            System.out.println("deleted");
        }
    }

}
