package com.example.CSWS.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class InstanceDto {

    private String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String state;
    private Double storage;
    private String address;
    private int port;
    private String keyName;
    private String os;
    private Date created;
    private String memberId;

    public InstanceDto() {    }

    public InstanceDto(String name, int id, String state, Double storage, String address, int port, String keyName, String os, Date created, String memberId) {
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
