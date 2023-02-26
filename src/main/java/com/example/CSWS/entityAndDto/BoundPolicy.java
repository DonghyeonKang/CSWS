package com.example.CSWS.entityAndDto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BoundPolicy {

    @Id
    @Column(name = "securityid")
    private String securityId;
    private String type;
    private String protocol;
    private String port;
    @Column(name = "cidrblock")
    private String cidrBlock;

    public BoundPolicy() {    }

    public BoundPolicy(String securityId, String type, String protocol, String port, String cidrBlock) {
        this.securityId = securityId;
        this.type = type;
        this.protocol = protocol;
        this.port = port;
        this.cidrBlock = cidrBlock;
    }
}
