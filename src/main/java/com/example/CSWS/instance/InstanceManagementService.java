package com.example.CSWS.instance;

import java.util.List;

public interface InstanceManagementService {

    // public List<Instance> findInstanceList(String ownerId);

    public Instance findInstanceDetail(String instanceId);
    // public InstanceDetail findInstanceDetail(String instanceId);

    public int startInstance(String instanceId);

    public int stopInstance(String instanceId);

    public int restartInstance(String instanceId);

    public int deleteInstance(String instanceId);

}
