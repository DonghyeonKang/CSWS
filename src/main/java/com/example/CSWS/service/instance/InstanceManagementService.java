package com.example.CSWS.service.instance;

import com.example.CSWS.domain.InstanceDto;
import com.example.CSWS.domain.instance.StartInstanceRequest;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Optional;

import java.util.List;

public interface InstanceManagementService {
    public List<InstanceDto> findInstanceList(String username);

    public Optional<InstanceDto> findInstanceDetails (String instanceId);
    // public InstanceDetail findInstanceDetail(String instanceId);

    public String startInstance(String instanceid);

    public String stopInstance(String instanceId);

    public String restartInstance(String instanceId);

    public String deleteInstance(String instanceId);

}
