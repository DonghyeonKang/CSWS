package com.example.CSWS.repository.instance;

<<<<<<< HEAD
import com.example.CSWS.domain.InstanceDto;
=======
import com.example.CSWS.domain.Instance;

import java.util.Optional;
>>>>>>> feature/domain-test

public interface InstanceRepository {

    public Instance save(Instance instance);

//    public Instance changeInstance(Instance instance);

    public Optional<Instance> findById(String instanceId);

}
