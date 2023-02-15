package com.example.CSWS.instance.instanceCreate;

import com.example.CSWS.instance.Instance;

public interface InstanceCreateService {

    public int createInstance(Instance instance);

    public void createKeyPair(String userName, String instanceName);

}
