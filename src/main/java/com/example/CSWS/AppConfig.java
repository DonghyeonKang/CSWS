package com.example.CSWS;

import com.example.CSWS.dashboard.security.*;
import com.example.CSWS.instance.*;
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