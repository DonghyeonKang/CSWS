package com.example.CSWS.repository.securityGroup;

import com.example.CSWS.entityAndDto.SecurityGroupDto;

public interface SecurityGroupRepository {

    public SecurityGroupDto findSecurityGroup(String instanceId);

    public SecurityGroupDto createSecurityGroup(String instanceId, SecurityGroupDto securityGroup);

}