package com.example.CSWS;

import com.example.CSWS.dto.InstanceDto;
import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import com.example.CSWS.user.UserDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstanceApp {

    public static void main(String[] args) throws ParseException {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigTest1.class);
        InstanceCreateService instanceCreateService = applicationContext.getBean("instanceCreateService", InstanceCreateService.class);
        InstanceManagementService instanceManagementService = applicationContext.getBean("instanceManagementService", InstanceManagementService.class);

        UserDto m1 = new UserDto("test", "test", "test@naver.com");
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = date1.parse("2023-01-30");
        InstanceDto i1 = new InstanceDto("temp", "random", "ready", (double)64, "0.0.0.0", 9998, "testKey", "ubuntu",
                date, "test");

        instanceCreateService.createInstance(i1);

        System.out.println("instance = " + instanceManagementService.findInstanceDetail(i1.getMemberId()));

    }

}
