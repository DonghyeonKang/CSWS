package com.example.CSWS.service.instance;

import com.example.CSWS.domain.instance.InstanceDto;

public interface InstanceCreateService {

    public int createInstance(InstanceDto instanceDto);

    public void createKeyPair(String userName, String instanceName);

}
