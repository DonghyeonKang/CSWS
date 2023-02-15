package com.example.CSWS.instance.instanceManagement;

import com.example.CSWS.dashboard.boundPolicy.BoundPolicyService;
import com.example.CSWS.instance.Instance;
import com.example.CSWS.instance.InstanceRepository;

public class InstanceManagementServiceImpl implements InstanceManagementService{

    private final InstanceRepository instanceRepository;
    private final BoundPolicyService boundPolicyService;

    public InstanceManagementServiceImpl(InstanceRepository instanceRepository, BoundPolicyService boundPolicyService) {
        this.instanceRepository = instanceRepository;
        this.boundPolicyService = boundPolicyService;
    }

    //    @Override
//    public List<Instance> findInstanceList(String ownerId) {
//        return null;
//    }

    @Override
    public Instance findInstanceDetail(String memberId) {
        return instanceRepository.findById(memberId);
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
