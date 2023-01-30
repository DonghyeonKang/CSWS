package com.example.CSWS.instance;

import com.example.CSWS.dashboard.security.BoundPolicyService;

import java.util.List;

public class InstanceManagementServiceImpl implements InstanceManagementService{

    private BoundPolicyService boundPolicyService;

    @Override
    public List<Instance> findInstanceList(String ownerId) {
        return null;
    }

    @Override
    public Instance findInstanceDetail(String instanceId) {
        return null;
    }

    @Override
    public int startInstance(String instanceId) {
        return 0;
    }

    @Override
    public int stopInstance(String instanceId) {
        return 0;
    }

    @Override
    public int restartInstance(String instanceId) {
        return 0;
    }

    @Override
    public int deleteInstance(String instanceId) {
        return 0;
    }
}
