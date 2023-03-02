package com.example.CSWS.domain.securityGroup;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class SecurityGroup {

    @Id
    @Column(name = "securityid")
    private String securityId;
    @Column(name = "securityname")
    private String securityName;
    private String comment;
    @Column(name = "memberid")
    private String memberId;
    @Column(name = "inboundnumber")
    private int inboundNumber;
    @Column(name = "outboundnumber")
    private int outboundNumber;

    public SecurityGroup() {    }

    @Builder
    public SecurityGroup(String securityId, String securityName, String comment, String memberId, int inboundNumber, int outboundNumber) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.comment = comment;
        this.memberId = memberId;
        this.inboundNumber = inboundNumber;
        this.outboundNumber = outboundNumber;
    }
}
