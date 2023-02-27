package com.example.CSWS.service.instance;

import com.example.CSWS.domain.InstanceDto;
import com.example.CSWS.repository.instance.InstanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstanceManagementServiceImpl implements InstanceManagementService{

    private final InstanceRepository instanceRepository;
//    private final BoundPolicyService boundPolicyService;

    @Override
    public List<InstanceDto> findInstanceList(String username) {
        return null;
    }

    @Override
    public Optional<InstanceDto> findInstanceDetail(String instanceId) {
        return Optional.of(new InstanceDto(instanceRepository.findById(instanceId).get()));
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
