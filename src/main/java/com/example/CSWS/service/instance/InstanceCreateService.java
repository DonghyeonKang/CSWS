package com.example.CSWS.service.instance;

import com.example.CSWS.entityAndDto.Instance;

public interface InstanceCreateService {

    public int createInstance(Instance instance);

    public void createKeyPair(String userName, String instanceName);

}
