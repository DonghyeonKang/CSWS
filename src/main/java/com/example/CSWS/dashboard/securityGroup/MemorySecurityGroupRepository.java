package com.example.CSWS.dashboard.securityGroup;

import java.util.HashMap;
import java.util.Map;

public class MemorySecurityGroupRepository implements SecurityGroupRepository{

    private static Map<String, SecurityGroup> temp = new HashMap<>();

    @Override
    public SecurityGroup findSecurityGroup(String instanceId) {

        return temp.get(instanceId);
    }

    @Override
    public SecurityGroup createSecurityGroup(String instanceId, SecurityGroup securityGroup) {

        return temp.put(instanceId, securityGroup);
    }
}
