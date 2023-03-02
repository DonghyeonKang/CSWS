package com.example.CSWS.controller;

import com.example.CSWS.domain.instance.StartInstanceRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class InstanceControllerTest {

    @Autowired  // test 에서는 autowired 로 의존성 주입을 받아야 한다 생성자나 롬복 방식으로 안되는 이유는 junit 이 생성자에 다른 의존성을 주입하려고 먼저 개입하기 때문이라 한다.
    private InstanceController instanceController;

    @Test
    void createForm() {
    }

    @Test
    void create() {
    }

    @Test
    void findList() {
    }

    @Test
    void getInstances() {

    }

    @Test
    void getInstanceDetails() {
    }

    @Test
    void startInstance() {
        //given
        StartInstanceRequest startInstanceRequest = new StartInstanceRequest();
        startInstanceRequest.setInstanceId("dong");

        //when
        String answer = instanceController.startInstance(startInstanceRequest);

        //then
        assertThat(answer).isEqualTo("start");
    }

    @Test
    void restartInstance() {
    }

    @Test
    void stopInstance() {
    }

    @Test
    void deleteInstance() {
    }
}