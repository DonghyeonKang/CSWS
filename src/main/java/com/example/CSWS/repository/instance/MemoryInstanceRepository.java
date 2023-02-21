package com.example.CSWS.repository.instance;

import com.example.CSWS.entityAndDto.InstanceDto;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//@Component
public class MemoryInstanceRepository implements InstanceRepository{

    private static Map<String, InstanceDto> temp = new HashMap<>();

    @Override
    public InstanceDto createInstance(InstanceDto instance) {
        temp.put(instance.getMemberId(), instance);
        return instance;
    }

    @Override
    public InstanceDto changeInstance(InstanceDto instance) {
        temp.replace(instance.getMemberId(), instance);
        return instance;
    }

    @Override
    public Optional<InstanceDto> findById(String memberId) {
        return Optional.ofNullable(temp.get(memberId));
    }
}
