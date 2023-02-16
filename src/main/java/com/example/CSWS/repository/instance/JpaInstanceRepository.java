package com.example.CSWS.repository.instance;

import com.example.CSWS.dto.InstanceDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaInstanceRepository extends JpaRepository<InstanceDto, String> {

    public InstanceDto createInstance(InstanceDto instance);

    public InstanceDto changeInstance(InstanceDto instance);


}
