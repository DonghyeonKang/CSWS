package com.example.CSWS.service.instance;

import com.example.CSWS.entityAndDto.Instance;
import com.example.CSWS.entityAndDto.InstanceDto;

import java.util.Optional;

public interface InstanceManagementService {

    // public List<Instance> findInstanceList(String ownerId);

    public Optional<InstanceDto> findInstanceDetail(String instanceId);
    // public InstanceDetail findInstanceDetail(String instanceId);

    public int startInstance(String instanceId);

    public int stopInstance(String instanceId);

    public int restartInstance(String instanceId);

    public int deleteInstance(String instanceId);

}
