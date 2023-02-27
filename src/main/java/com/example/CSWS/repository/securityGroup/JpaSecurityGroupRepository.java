package com.example.CSWS.repository.securityGroup;

import com.example.CSWS.domain.SecurityGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaSecurityGroupRepository extends JpaRepository<SecurityGroup, String>, SecurityGroupRepository {
}
