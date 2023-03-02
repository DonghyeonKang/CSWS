package com.example.CSWS.domain.securityGroup;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class Relation {

    @Id
    @Column(name = "instanceid")
    private String instanceId;

    @Column(name = "securityid")
    private String securityId;

    public Relation(String instanceId, String securityId) {
        this.instanceId = instanceId;
        this.securityId = securityId;
    }
}
