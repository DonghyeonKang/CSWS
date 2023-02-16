package com.example.CSWS.dto;

import lombok.Data;

@Data
public class SecurityGroupDto {

    private String securityId;
    private String securityName;
    private String comment;
    private String memberId;
    private int inboundNumber;
    private int outboundNumber;

    public SecurityGroupDto(String securityId, String securityName, String comment, String memberId, int inboundNumber, int outboundNumber) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.comment = comment;
        this.memberId = memberId;
        this.inboundNumber = inboundNumber;
        this.outboundNumber = outboundNumber;
    }
}
