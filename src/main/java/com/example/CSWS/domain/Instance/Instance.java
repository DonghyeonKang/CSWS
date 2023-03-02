package com.example.CSWS.domain.instance;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@NoArgsConstructor
public class Instance {

    private String name;
    @Id
    @Column
    private String id;
    private String state;
    private Double storage;
    private String address;
    private int code;
    private int port;
    @Column(name = "keyname")
    private String keyName;
    private String os;
    private Date created;
    @Column(name = "memberid")
    private String memberId;

    @Builder
    public Instance(String name, String id, String state, Double storage, String address, int port, String keyName, String os, Date created, String memberId) {
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
