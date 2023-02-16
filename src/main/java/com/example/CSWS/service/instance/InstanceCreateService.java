package com.example.CSWS.service.instance;

import com.example.CSWS.dto.InstanceDto;

public interface InstanceCreateService {

    public int createInstance(InstanceDto instance);

    public void createKeyPair(String userName, String instanceName);

}
