package com.example.CSWS;

import com.example.CSWS.entityAndDto.Instance;
import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import com.example.CSWS.user.UserDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstanceDbConnectionTestApp {

    public static void main(String[] args) throws ParseException {

//        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);
//
//        InstanceCreateService instanceCreateService = ac.getBean(InstanceCreateService.class);
//        InstanceManagementService instanceManagementService = ac.getBean(InstanceManagementService.class);
//
//        UserDto m1 = new UserDto("test", "test", "test@naver.com");
//        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = date1.parse("2023-01-30");
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        Instance i1 = new Instance("temp", "random", "ready", (double)64, "0.0.0.0", 9998, "testKey", "ubuntu",
//                date, "test");
//
//        instanceCreateService.createInstance(i1);
//
//        System.out.println("instance = " + instanceManagementService.findInstanceDetail(i1.getId()));

    }

}
