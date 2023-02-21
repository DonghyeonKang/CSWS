package com.example.CSWS.service.instance;

import com.example.CSWS.entityAndDto.Instance;
import com.example.CSWS.repository.instance.InstanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@RequiredArgsConstructor
public class InstanceCreateServiceImpl implements InstanceCreateService{

    private final InstanceRepository instanceRepository;
    // private SecurityGroupService securityGroupService;
    // -> 키페어 생성을 위한 특정 유저, 인스턴스 조회에 필요한 서비스

//    public InstanceCreateServiceImpl(InstanceRepository instanceRepository) {
//        this.instanceRepository = instanceRepository;
//    }

    @Override
    public int createInstance(Instance instance) {
        instanceRepository.save(instance);
        return 1;
    }

    @Override
    public void createKeyPair(String userName, String instanceId) {
        instanceRepository.findById(instanceId);
        // securityGroupService.findSecurityGroup(userName);
    }
}
