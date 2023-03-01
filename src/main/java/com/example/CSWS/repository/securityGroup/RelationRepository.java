package com.example.CSWS.repository.securityGroup;

import com.example.CSWS.domain.Relation;

import java.util.Optional;

public interface RelationRepository {

    public Optional<Relation> findById(String instanceId);

    public Relation save(Relation relation);

}
