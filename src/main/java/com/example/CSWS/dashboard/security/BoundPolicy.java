package com.example.CSWS.dashboard.security;

public class BoundPolicy {

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

    public String getSecurityId() {
        return securityId;
    }

    public void setSecurityId(String securityId) {
        this.securityId = securityId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getCidrBlock() {
        return cidrBlock;
    }

    public void setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    @Override
    public String toString() {
        return "boundPolicy{ " +
                "securityId=" + securityId +
                ", type=" + type +
                ", protocol=" + protocol +
                ", port=" + port +
                ", cidrBlock=" + cidrBlock + " }";
    }
}