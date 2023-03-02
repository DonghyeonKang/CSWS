package com.example.CSWS.service.instance;

import com.example.CSWS.domain.instance.InstanceDto;
import com.example.CSWS.repository.instance.InstanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//@Component
@Service
@RequiredArgsConstructor
public class InstanceCreateServiceImpl implements InstanceCreateService{

    private final InstanceRepository instanceRepository;
    // private SecurityGroupService securityGroupService;
    // -> 키페어 생성을 위한 특정 유저, 인스턴스 조회에 필요한 서비스

    @Override
    public int createInstance(InstanceDto instanceDto) {
        instanceRepository.save(instanceDto.toEntity());
        return 1;
    }

    @Override
    public void createKeyPair(String userName, String instanceId) {
        instanceRepository.findById(instanceId);
        // securityGroupService.findSecurityGroup(userName);
    }
}
