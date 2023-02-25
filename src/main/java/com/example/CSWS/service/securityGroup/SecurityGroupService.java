package com.example.CSWS.service.securityGroup;

import com.example.CSWS.domain.SecurityGroupDto;

public interface SecurityGroupService {

    public SecurityGroupDto findSecurityGroup(String instanceId);

    public SecurityGroupDto createSecurityGroup(String instanceId, SecurityGroupDto securityGroup);

}
