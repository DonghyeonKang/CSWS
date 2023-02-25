package com.example.CSWS.repository.instance;

import com.example.CSWS.domain.InstanceDto;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
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
    public InstanceDto findById(String memberId) {
        return temp.get(memberId);
    }
}
