package com.example.CSWS.instance;

public interface InstanceRepository {

    public Instance createInstance(Instance instance);

    public Instance changeInstance(Instance instance);

    public Instance findById(String instanceId);

}
