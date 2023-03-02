package com.example.CSWS.service.instance;

import com.example.CSWS.common.shRunner.ShRunner;
import com.example.CSWS.domain.InstanceDto;
import com.example.CSWS.domain.instance.StartInstanceRequest;
import com.example.CSWS.repository.instance.InstanceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InstanceManagementServiceImpl implements InstanceManagementService{

    private final InstanceRepository instanceRepository;
    private final ShRunner shRunner;

    @Override
    public List<InstanceDto> findInstanceList(String username) {
        return null;
    }

    @Override
    public Optional<InstanceDto> findInstanceDetails(String instanceId) {
        return Optional.of(new InstanceDto(instanceRepository.findById(instanceId).get()));
    }

    @Override
    public String startInstance(String instanceId) {
        try {
            shRunner.execCommand("StartContainer.sh", instanceId);
            return "success";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override
    public String stopInstance(String instanceId) {
        try {
            shRunner.execCommand("StopContainer.sh", instanceId);
            return "success";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override
    public String restartInstance(String instanceId) {
        try {
            shRunner.execCommand("RestartContainer.sh", instanceId);
            return "success";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override
    public String deleteInstance(String instanceId) {
        try {
            shRunner.execCommand("RemoveContainer.sh", instanceId);
            return "success";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
