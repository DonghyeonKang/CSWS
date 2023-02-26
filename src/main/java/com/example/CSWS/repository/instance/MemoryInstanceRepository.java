package com.example.CSWS.repository.instance;

<<<<<<< HEAD
import com.example.CSWS.domain.InstanceDto;
import org.springframework.stereotype.Component;
=======
import com.example.CSWS.domain.Instance;
>>>>>>> feature/domain-test

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
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
