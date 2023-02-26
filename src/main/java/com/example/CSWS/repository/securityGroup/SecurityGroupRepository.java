package com.example.CSWS.repository.securityGroup;

<<<<<<< HEAD
import com.example.CSWS.domain.SecurityGroupDto;
=======
import com.example.CSWS.domain.SecurityGroup;

import java.util.Optional;
>>>>>>> feature/domain-test

public interface SecurityGroupRepository {

    public Optional<SecurityGroup> findById(String securityId);

    public SecurityGroup save(SecurityGroup securityGroup);

}
