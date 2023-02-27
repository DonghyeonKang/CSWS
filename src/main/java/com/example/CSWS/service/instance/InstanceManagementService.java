package com.example.CSWS.service.instance;

import com.example.CSWS.domain.InstanceDto;

import java.util.List;

public interface InstanceManagementService {

    public List<InstanceDto> findInstanceList(String username);

    public InstanceDto findInstanceDetail(String instanceId);
    // public InstanceDetail findInstanceDetail(String instanceId);

    public int startInstance(String instanceId);

    public int stopInstance(String instanceId);

    public int restartInstance(String instanceId);

    public int deleteInstance(String instanceId);

}
