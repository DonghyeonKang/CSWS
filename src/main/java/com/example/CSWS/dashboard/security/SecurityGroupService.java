package com.example.CSWS.dashboard.security;

public interface SecurityGroupService {

    public SecurityGroup findSecurityGroup(String instanceId);

    public SecurityGroup createSecurityGroup(String instanceId, SecurityGroup securityGroup);

}
