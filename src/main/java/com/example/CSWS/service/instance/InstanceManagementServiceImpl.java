package com.example.CSWS.service.instance;

import com.example.CSWS.domain.InstanceDto;
import com.example.CSWS.service.boundPolicy.BoundPolicyService;
import com.example.CSWS.repository.instance.InstanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InstanceManagementServiceImpl implements InstanceManagementService{

    private final InstanceRepository instanceRepository;
    private final BoundPolicyService boundPolicyService;

//    public InstanceManagementServiceImpl(InstanceRepository instanceRepository, BoundPolicyService boundPolicyService) {
//        this.instanceRepository = instanceRepository;
//        this.boundPolicyService = boundPolicyService;
//    }

    //    @Override
//    public List<InstanceDto> findInstanceList(String ownerId) {
//        return null;
//    }

    @Override
    public InstanceDto findInstanceDetail(String memberId) {
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
