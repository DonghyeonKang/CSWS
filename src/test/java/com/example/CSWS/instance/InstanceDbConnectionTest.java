package com.example.CSWS.instance;

import com.example.CSWS.AppConfig;
import com.example.CSWS.domain.instance.InstanceDto;
import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import com.example.CSWS.domain.user.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
//@Transactional
public class InstanceDbConnectionTest {

    @Test
//    @Transactional
    void testInstanceServices() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        InstanceManagementService instanceManagementService = ac.getBean(InstanceManagementService.class);

        InstanceCreateService instanceCreateService = ac.getBean(InstanceCreateService.class);

        UserDto m1 = new UserDto("test", "test", "test@naver.com");
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = date1.parse("2023-01-30");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        InstanceDto i1 = new InstanceDto();
        i1.setName("temp");
        i1.setId("random");
        i1.setState("ready");
        i1.setStorage((double)64);
        i1.setAddress("0.0.0.0");
        i1.setPort(9998);
        i1.setKeyName("testKey");
        i1.setOs("ubuntu");
        i1.setCreated(date);
        i1.setMemberId("test");

        instanceCreateService.createInstance(i1);

        System.out.println("instance = " + instanceManagementService.findInstanceDetails(i1.getId()));
    }

}
