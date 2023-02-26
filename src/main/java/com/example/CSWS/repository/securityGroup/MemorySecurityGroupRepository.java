package com.example.CSWS.repository.securityGroup;

<<<<<<< HEAD
import com.example.CSWS.domain.SecurityGroupDto;
import org.springframework.stereotype.Component;
=======
import com.example.CSWS.domain.SecurityGroup;
>>>>>>> feature/domain-test

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//@Component
public class MemorySecurityGroupRepository implements SecurityGroupRepository{

    private static Map<String, SecurityGroup> temp = new HashMap<>();

    @Override
    public Optional<SecurityGroup> findById(String instanceId) {

        return Optional.ofNullable(temp.get(instanceId));
    }

    @Override
    public SecurityGroup save(SecurityGroup securityGroup) {

        return temp.put(securityGroup.getSecurityId(), securityGroup);
    }
}
