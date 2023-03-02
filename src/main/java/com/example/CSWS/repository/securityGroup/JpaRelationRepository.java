package com.example.CSWS.repository.securityGroup;

import com.example.CSWS.domain.securityGroup.Relation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaRelationRepository extends JpaRepository<Relation, String>, RelationRepository {
}
