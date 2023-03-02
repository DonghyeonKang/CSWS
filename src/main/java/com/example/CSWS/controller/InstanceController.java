package com.example.CSWS.controller;

import com.example.CSWS.domain.Instance;
import com.example.CSWS.domain.InstanceDto;
import com.example.CSWS.domain.instance.StartInstanceRequest;
import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

// 필요한 클래스 앞에 @Service 어노테이션을 붙여줘야 인식한다.
// 서비스, 컨트롤러, 리포지토리 어노테이션은 모두 컴포넌트 어노테이션을 포함한다.
// 스프링 빈으로 자동 등록된다.
// = 컴포넌트 스캔. 여기에 오토 와이어드를 이용한 자동 의존관계로
// 서비스, 컨트롤러, 리포지토리를 연결한다.
@RestController
@RequiredArgsConstructor
@RequestMapping("/instances")
public class InstanceController {

    private final InstanceCreateService instanceCreateService;
    private final InstanceManagementService instanceManagementService;

    @GetMapping("/new")
    public String createForm() {
        return "forTest/instances/createInstanceForm";
    }

    @PostMapping("/new")
    public String create(InstanceDto instanceDto) {

        instanceCreateService.createInstance(instanceDto);

        return "redirect:/";
    }

    // 인스턴스 목록 조회
    @GetMapping()
    public String getInstances(Model model) {
        String username = "";
        instanceManagementService.findInstanceList(username);
        return "forTest/instances/findInstances";
    }

    // 인스턴스 세부사항 조회
    @GetMapping("/details")
    public String getInstanceDetails() {
        String instanceId = "";
        instanceManagementService.findInstanceDetails(instanceId);
        return "details";
    }

    // 인스턴스 시작
    @PostMapping("/start")
    public String startInstance(@ModelAttribute StartInstanceRequest request) {
        String result = instanceManagementService.startInstance(request.getInstanceId());
        return result;
    }

    // 인스턴스 재시작
    @PostMapping("/restart")
    public String restartInstance(@ModelAttribute StartInstanceRequest request) {
        String result = instanceManagementService.restartInstance(request.getInstanceId());
        return result;
    }

    // 인스턴스 정지
    @PostMapping("/stop")
    public String stopInstance(@ModelAttribute StartInstanceRequest request) {
        String result = instanceManagementService.stopInstance(request.getInstanceId());
        return result;
    }

    // 인스턴스 삭제
    @PostMapping("/delete")
    public String deleteInstance(@ModelAttribute StartInstanceRequest request) {
        String result = instanceManagementService.deleteInstance(request.getInstanceId());
        return result;
    }
}
