package com.example.CSWS.repository.instance;

import com.example.CSWS.domain.Instance;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

//@Component
public class MemoryInstanceRepository implements InstanceRepository{

    private static Map<String, Instance> temp = new HashMap<>();

    @Override
    public Instance save(Instance instance) {
        temp.put(instance.getMemberId(), instance);
        return instance;
    }

    //@Override
    public Instance changeInstance(Instance instance) {
        temp.replace(instance.getMemberId(), instance);
        return instance;
    }

    @Override
    public Optional<Instance> findById(String memberId) {
        return Optional.ofNullable(temp.get(memberId));
    }
}
