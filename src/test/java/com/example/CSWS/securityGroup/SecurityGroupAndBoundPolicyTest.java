package com.example.CSWS.securityGroup;

import com.example.CSWS.NewAppConfig1;
import com.example.CSWS.domain.boundPolicy.BoundPolicy;
import com.example.CSWS.domain.boundPolicy.BoundPolicyDto;
import com.example.CSWS.domain.securityGroup.SecurityGroupDto;
import com.example.CSWS.service.boundPolicy.BoundPolicyService;
import com.example.CSWS.service.securityGroup.SecurityGroupService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class SecurityGroupAndBoundPolicyTest {

    @Test
    void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);

        SecurityGroupService securityGroupService = ac.getBean(SecurityGroupService.class);
        BoundPolicyService boundPolicyService = ac.getBean(BoundPolicyService.class);

        BoundPolicyDto inbound = new BoundPolicyDto("temp", "ssh", "tcp", "9998", "random");
        BoundPolicyDto outbound = new BoundPolicyDto("temp", "ftp", "tcp", "9999", "random");
        SecurityGroupDto s1 = new SecurityGroupDto("temp", "tmp", "for test", "test", 1, 1);

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
