package com.example.CSWS.repository.instance;

<<<<<<< HEAD
//public interface JpaInstanceRepository extends JpaRepository<InstanceDto, String>, InstanceRepository {
//
//    public InstanceDto createInstance(InstanceDto instance);
//
//    public InstanceDto changeInstance(InstanceDto instance);
//
//}
=======
import com.example.CSWS.domain.Instance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaInstanceRepository extends JpaRepository<Instance, String>, InstanceRepository {

//    @Override
//    public Instance save(Instance instance);

//    public Instance changeInstance(Instance instance);

}
>>>>>>> feature/domain-test
