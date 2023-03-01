package com.example.CSWS.domain.boundPolicy;

import lombok.Data;

@Data
public class BoundPolicyDto {

    private String securityId;
    private String type;
    private String protocol;
    private String port;
    private String cidrBlock;

    public BoundPolicyDto() {    }

    public BoundPolicyDto(String securityId, String type, String protocol, String port, String cidrBlock) {
        this.securityId = securityId;
        this.type = type;
        this.protocol = protocol;
        this.port = port;
        this.cidrBlock = cidrBlock;
    }
}
