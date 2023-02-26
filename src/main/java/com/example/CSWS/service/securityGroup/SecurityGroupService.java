package com.example.CSWS.service.securityGroup;

<<<<<<< HEAD
import com.example.CSWS.domain.SecurityGroupDto;
=======
import com.example.CSWS.domain.SecurityGroup;

import java.util.Optional;
>>>>>>> feature/domain-test

public interface SecurityGroupService {

    public Optional<SecurityGroup> findSecurityGroup(String instanceId);

    public SecurityGroup createSecurityGroup(String instanceId, SecurityGroup securityGroup);

}
