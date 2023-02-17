package com.example.CSWS;

import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.text.ParseException;

public class InstanceApp {

    public static void main(String[] args) throws ParseException {

        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);

        InstanceCreateService instanceCreateService = ac.getBean(InstanceCreateService.class);
        InstanceManagementService instanceManagementService = ac.getBean(InstanceManagementService.class);


    }

}
