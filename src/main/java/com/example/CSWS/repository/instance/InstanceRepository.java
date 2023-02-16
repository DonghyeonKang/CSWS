package com.example.CSWS.repository.instance;

import com.example.CSWS.dto.InstanceDto;

public interface InstanceRepository {

    public InstanceDto createInstance(InstanceDto instance);

    public InstanceDto changeInstance(InstanceDto instance);

    public InstanceDto findById(String instanceId);

}
