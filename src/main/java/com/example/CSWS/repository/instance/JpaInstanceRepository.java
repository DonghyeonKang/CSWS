package com.example.CSWS.repository.instance;

import com.example.CSWS.domain.Instance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaInstanceRepository extends JpaRepository<Instance, String>, InstanceRepository {

//    @Override
//    public Instance save(Instance instance);

//    public Instance changeInstance(Instance instance);

}