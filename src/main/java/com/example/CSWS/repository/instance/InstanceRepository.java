package com.example.CSWS.repository.instance;

import com.example.CSWS.entityAndDto.Instance;

import java.util.Optional;

public interface InstanceRepository {

    public Instance save(Instance instance);

//    public Instance changeInstance(Instance instance);

    public Optional<Instance> findById(String instanceId);

}
