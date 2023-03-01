package com.example.CSWS.repository.securityGroup;

import com.example.CSWS.domain.securityGroup.SecurityGroup;

import java.util.Optional;

public interface SecurityGroupRepository {

    public Optional<SecurityGroup> findById(String securityId);

    public SecurityGroup save(SecurityGroup securityGroup);

}
