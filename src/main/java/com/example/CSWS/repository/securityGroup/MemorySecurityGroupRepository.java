package com.example.CSWS.repository.securityGroup;

import com.example.CSWS.entityAndDto.SecurityGroupDto;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MemorySecurityGroupRepository implements SecurityGroupRepository{

    private static Map<String, SecurityGroupDto> temp = new HashMap<>();

    @Override
    public SecurityGroupDto findSecurityGroup(String instanceId) {

        return temp.get(instanceId);
    }

    @Override
    public SecurityGroupDto createSecurityGroup(String instanceId, SecurityGroupDto securityGroup) {

        return temp.put(instanceId, securityGroup);
    }
}
