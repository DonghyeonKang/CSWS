package com.example.CSWS.service.instance;

import com.example.CSWS.domain.instance.InstanceDto;

public interface InstanceCreateService {

    public String createInstance();

    public String createKeyPair(String userName, String instanceName);

}
