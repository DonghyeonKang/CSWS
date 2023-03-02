package com.example.CSWS.service.securityGroup;

import com.example.CSWS.domain.securityGroup.SecurityGroup;
import com.example.CSWS.domain.securityGroup.SecurityGroupDto;

import java.util.Optional;

public interface SecurityGroupService {

    public Optional<SecurityGroup> findSecurityGroup(String instanceId);

    public SecurityGroup createSecurityGroup(String instanceId, SecurityGroupDto securityGroupDto);

}
