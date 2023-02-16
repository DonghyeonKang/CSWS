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

        ApplicationContext ac = new AnnotationConfigApplicationContext(NewAppConfig1.class);

        InstanceCreateService instanceCreateService = ac.getBean(InstanceCreateService.class);
        InstanceManagementService instanceManagementService = ac.getBean(InstanceManagementService.class);


    }

}
