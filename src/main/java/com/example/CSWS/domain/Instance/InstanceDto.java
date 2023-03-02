package com.example.CSWS.domain.instance;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.Date;

@Data
@NoArgsConstructor
public class InstanceDto {

    private String name;
    private String id;
    private String state;
    private Double storage;
    private String address;
    private int port;
    @Column(name = "keyname")
    private String keyName;
    private String os;
    private Date created;
    @Column(name = "memberid")
    private String memberId;

    @Builder
    public InstanceDto(Instance instance) {
        this.name = instance.getName();
        this.id = instance.getId();
        this.state = instance.getState();
        this.storage = instance.getStorage();
        this.address = instance.getAddress();
        this.port = instance.getPort();
        this.keyName = instance.getKeyName();
        this.os = instance.getOs();
        this.created = instance.getCreated();
        this.memberId = instance.getMemberId();
    }

    public Instance toEntity() {
        return Instance.builder()
                .name(name)
                .id(id)
                .state(state)
                .storage(storage)
                .address(address)
                .port(port)
                .keyName(keyName)
                .os(os)
                .created(created)
                .memberId(memberId)
                .build();
    }
}
