package com.example.CSWS.domain;

import lombok.Builder;
import lombok.Data;

@Data
public class SecurityGroupDto {

    private String securityId;
    private String securityName;
    private String comment;
    private String memberId;
    private int inboundNumber;
    private int outboundNumber;

    public SecurityGroupDto() {    }

    @Builder
    public SecurityGroupDto(String securityId, String securityName, String comment, String memberId, int inboundNumber, int outboundNumber) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.comment = comment;
        this.memberId = memberId;
        this.inboundNumber = inboundNumber;
        this.outboundNumber = outboundNumber;
    }

    public SecurityGroup toEntity() {
        return SecurityGroup.builder()
                .securityId(securityId)
                .securityName(securityName)
                .comment(comment)
                .memberId(memberId)
                .inboundNumber(inboundNumber)
                .outboundNumber(outboundNumber)
                .build();
    }
}
