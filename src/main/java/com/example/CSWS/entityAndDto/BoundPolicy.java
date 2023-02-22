package com.example.CSWS.entityAndDto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class BoundPolicy {

    @Id
    private String securityId;
    private String type;
    private String protocol;
    private String port;
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
