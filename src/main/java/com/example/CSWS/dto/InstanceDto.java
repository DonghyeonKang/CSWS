package com.example.CSWS.dto;

import lombok.Data;

import java.util.Date;

@Data
public class InstanceDto {

    private String name;
    private String id;
    private String state;
    private Double storage;
    private String address;
    private int port;
    private String keyName;
    private String os;
    private Date created;
    private String memberId;

    public InstanceDto(String name, String id, String state, Double storage, String address, int port, String keyName, String os, Date created, String memberId) {
        this.name = name;
        this.id = id;
        this.state = state;
        this.storage = storage;
        this.address = address;
        this.port = port;
        this.keyName = keyName;
        this.os = os;
        this.created = created;
        this.memberId = memberId;
    }
}
