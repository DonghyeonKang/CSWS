package com.example.CSWS.instance;

public class InstanceCreateServiceImpl implements InstanceCreateService{

    private final InstanceRepository instanceRepository;
    // private SecurityGroupService securityGroupService;
    // -> 키페어 생성을 위한 특정 유저, 인스턴스 조회에 필요한 서비스

    public InstanceCreateServiceImpl(InstanceRepository instanceRepository) {
        this.instanceRepository = instanceRepository;
    }

    @Override
    public int createInstance(Instance instance) {
        instanceRepository.createInstance(instance);
        return 1;
    }

    @Override
    public void createKeyPair(String userName, String instanceId) {
        instanceRepository.findById(instanceId);
        // securityGroupService.findSecurityGroup(userName);
    }
}
