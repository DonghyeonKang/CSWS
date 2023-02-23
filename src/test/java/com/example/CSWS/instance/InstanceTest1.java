package com.example.CSWS.instance;

import com.example.CSWS.NewAppConfig1;
import com.example.CSWS.entityAndDto.InstanceDto;
import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import com.example.CSWS.entityAndDto.user.UserDto;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Transactional
public class InstanceTest1 {

    @Test
    void test() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);

        InstanceCreateService instanceCreateService = ac.getBean(InstanceCreateService.class);
        InstanceManagementService instanceManagementService = ac.getBean(InstanceManagementService.class);

        UserDto m1 = new UserDto("test", "test", "test@naver.com");
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = date1.parse("2023-01-30");
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        InstanceDto i1 = new InstanceDto("temp", "random", "ready", (double)64, "0.0.0.0", 9998, "testKey", "ubuntu",
                date, "test");

        instanceCreateService.createInstance(i1);

        System.out.println("instance = " + instanceManagementService.findInstanceDetail(i1.getMemberId()));
    }
}
