package com.example.CSWS.appConfigTest;

import com.example.CSWS.NewAppConfig1;
import com.example.CSWS.repository.instance.MemoryInstanceRepository;
import com.example.CSWS.service.boundPolicy.BoundPolicyService;
import com.example.CSWS.service.securityGroup.SecurityGroupService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;

@Transactional
public class NewAppConfigTest1 {

    @Test
    void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);

        BoundPolicyService boundPolicyService = ac.getBean(BoundPolicyService.class);
        assertThat(boundPolicyService).isInstanceOf(BoundPolicyService.class);

        SecurityGroupService securityGroupService = ac.getBean(SecurityGroupService.class);
        assertThat(securityGroupService).isInstanceOf(SecurityGroupService.class);

        MemoryInstanceRepository memoryInstanceRepository = ac.getBean(MemoryInstanceRepository.class);
        assertThat(memoryInstanceRepository).isInstanceOf(MemoryInstanceRepository.class);
    }
}
