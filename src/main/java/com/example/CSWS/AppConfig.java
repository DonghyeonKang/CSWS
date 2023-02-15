package com.example.CSWS;

import com.example.CSWS.dashboard.boundPolicy.BoundPolicyRepository;
import com.example.CSWS.dashboard.boundPolicy.BoundPolicyService;
import com.example.CSWS.dashboard.boundPolicy.BoundPolicyServiceImpl;
import com.example.CSWS.dashboard.boundPolicy.MemoryBoundPolicyRepository;
import com.example.CSWS.dashboard.securityGroup.*;
import com.example.CSWS.instance.*;
import com.example.CSWS.instance.instanceCreate.InstanceCreateService;
import com.example.CSWS.instance.instanceCreate.InstanceCreateServiceImpl;
import com.example.CSWS.instance.instanceManagement.InstanceManagementService;
import com.example.CSWS.instance.instanceManagement.InstanceManagementServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public InstanceCreateService instanceCreateService() {
        return new InstanceCreateServiceImpl(instanceRepository());
    }

    @Bean
    public InstanceManagementService instanceManagementService() {
        return new InstanceManagementServiceImpl(instanceRepository(), boundPolicyService());
    }

    //private static InstanceRepository m1 = new MemoryInstanceRepository();
    @Bean
    private static InstanceRepository instanceRepository() {
        return new MemoryInstanceRepository();
    }

    @Bean
    public BoundPolicyService boundPolicyService() {
        return new BoundPolicyServiceImpl(boundPolicyRepository());
    }

    @Bean
    private static BoundPolicyRepository boundPolicyRepository() {
        return new MemoryBoundPolicyRepository();
    }

    @Bean
    public SecurityGroupService securityGroupService() {
        return new SecurityGroupServiceImpl(securityGroupRepository(), boundPolicyService());
    }

    @Bean
    private static SecurityGroupRepository securityGroupRepository() {
        return new MemorySecurityGroupRepository();
    }

}
