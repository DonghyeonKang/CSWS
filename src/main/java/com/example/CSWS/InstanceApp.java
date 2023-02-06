package com.example.CSWS;

import com.example.CSWS.instance.Instance;
import com.example.CSWS.instance.InstanceCreateService;
import com.example.CSWS.instance.InstanceManagementService;
import com.example.CSWS.member.Member;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstanceApp {

    public static void main(String[] args) throws ParseException {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        InstanceCreateService instanceCreateService = applicationContext.getBean("instanceCreateService", InstanceCreateService.class);
        InstanceManagementService instanceManagementService = applicationContext.getBean("instanceManagementService", InstanceManagementService.class);

        Member m1 = new Member("test", "test", "test@naver.com");
        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = date1.parse("2023-01-30");
        Instance i1 = new Instance("temp", "random", "ready", (double)64, "0.0.0.0", 9998, "testKey", "ubuntu",
                date, "test");

        instanceCreateService.createInstance(i1);

        System.out.println("instance = " + instanceManagementService.findInstanceDetail(i1.getMemberId()));

    }

}
