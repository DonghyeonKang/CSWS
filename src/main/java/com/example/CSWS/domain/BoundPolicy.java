package com.example.CSWS.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
public class BoundPolicy {

    @Id
    @Column(name = "securityid")
    private String securityId;
    private String type;
    private String protocol;
    private String port;
    @Column(name = "cidrblock")
    private String cidrBlock;

    @Builder
    public BoundPolicy(String securityId, String type, String protocol, String port, String cidrBlock) {
        this.securityId = securityId;
        this.type = type;
        this.protocol = protocol;
        this.port = port;
        this.cidrBlock = cidrBlock;
    }
}
