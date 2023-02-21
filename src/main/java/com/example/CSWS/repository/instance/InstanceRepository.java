package com.example.CSWS.repository.instance;

import com.example.CSWS.entityAndDto.InstanceDto;

import java.util.Optional;

public interface InstanceRepository {

    public InstanceDto createInstance(InstanceDto instance);

    public InstanceDto changeInstance(InstanceDto instance);

    public Optional<InstanceDto> findById(String instanceId);

}
