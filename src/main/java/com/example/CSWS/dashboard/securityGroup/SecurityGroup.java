package com.example.CSWS.dashboard.securityGroup;

public class SecurityGroup {

    private String securityId;
    private String securityName;
    private String comment;
    private String memberId;
    private int inboundNumber;
    private int outboundNumber;

    public SecurityGroup() {    }

    public SecurityGroup(String securityId, String securityName, String comment, String memberId, int inboundNumber, int outboundNumber) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.comment = comment;
        this.memberId = memberId;
        this.inboundNumber = inboundNumber;
        this.outboundNumber = outboundNumber;
    }

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public int getInboundNumber() {
        return inboundNumber;
    }

    public void setInboundNumber(int inboundNumber) {
        this.inboundNumber = inboundNumber;
    }

    public int getOutboundNumber() {
        return outboundNumber;
    }

    public void setOutboundNumber(int outboundNumber) {
        this.outboundNumber = outboundNumber;
    }

    // SecurityGroup(String securityId, String securityName, String comment, String memberId,
    // int inboundNumber, int outboundNumber)
    @Override
    public String toString() {
        return "SecurityGroup{ " +
                "securityId=" + securityId +
                ", securityName=" + securityName +
                ", comment=" + comment +
                ", memberId=" + memberId +
                ", inboundNumber=" + inboundNumber +
                ", outboundNumber=" + outboundNumber + " }";
    }
}
