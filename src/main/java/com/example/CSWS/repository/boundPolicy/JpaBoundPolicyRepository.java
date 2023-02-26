package com.example.CSWS.repository.boundPolicy;

import com.example.CSWS.entityAndDto.BoundPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaBoundPolicyRepository extends JpaRepository<BoundPolicy, String>, BoundPolicyRepository{



}
