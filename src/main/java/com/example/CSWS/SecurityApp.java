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

        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);

        SecurityGroupService securityGroupService = ac.getBean(SecurityGroupService.class);
        BoundPolicyService boundPolicyService = ac.getBean(BoundPolicyService.class);

        }

}

