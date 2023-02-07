package com.example.CSWS.dashboard.security;

import java.util.List;
import java.util.Map;

public class SecurityGroupServiceImpl implements SecurityGroupService{

    private final SecurityGroupRepository securityGroupRepository;
    private final BoundPolicyService boundPolicyService;

    public SecurityGroupServiceImpl(SecurityGroupRepository securityGroupRepository, BoundPolicyService boundPolicyService) {
        this.securityGroupRepository = securityGroupRepository;
        this.boundPolicyService = boundPolicyService;
    }

    @Override
    public SecurityGroup findSecurityGroup(String instanceId) {
        
        // instanceId를 이용해 DB의 realtion에서 대응되는 securityId 가져오기
        String securityId = "";
        // DB에서 securityId를 이용해 해당하는 보안그룹 row 가져오기

        return securityGroupRepository.findSecurityGroup(instanceId);
    }

    @Override
    public SecurityGroup createSecurityGroup(String instanceId, SecurityGroup newSecurityGroup) {

        // intanceId에 대응되는 securityId 생성 후 DB relation 테이블에 저장
        // DB에 securityGroup 저장
        securityGroupRepository.createSecurityGroup(instanceId, newSecurityGroup);

        return newSecurityGroup;
    }
}
