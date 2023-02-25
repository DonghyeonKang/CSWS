package com.example.CSWS.service.instance;

import com.example.CSWS.domain.InstanceDto;
import com.example.CSWS.repository.instance.InstanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InstanceCreateServiceImpl implements InstanceCreateService{

    private final InstanceRepository instanceRepository;
    // private SecurityGroupService securityGroupService;
    // -> 키페어 생성을 위한 특정 유저, 인스턴스 조회에 필요한 서비스

//    public InstanceCreateServiceImpl(InstanceRepository instanceRepository) {
//        this.instanceRepository = instanceRepository;
//    }

    @Override
    public int createInstance(InstanceDto instance) {
        instanceRepository.createInstance(instance);
        return 1;
    }

    @Override
    public void createKeyPair(String userName, String instanceId) {
        instanceRepository.findById(instanceId);
        // securityGroupService.findSecurityGroup(userName);
    }
}
