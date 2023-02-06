package com.example.CSWS.instance;

import java.util.HashMap;
import java.util.Map;

public class MemoryInstanceRepository implements InstanceRepository{

    private static Map<String, Instance> temp = new HashMap<>();

    @Override
    public Instance createInstance(Instance instance) {
        temp.put(instance.getMemberId(), instance);
        return instance;
    }

    @Override
    public Instance changeInstance(Instance instance) {
        temp.replace(instance.getMemberId(), instance);
        return instance;
    }

    @Override
    public Instance findById(String memberId) {
        return temp.get(memberId);
    }
}
