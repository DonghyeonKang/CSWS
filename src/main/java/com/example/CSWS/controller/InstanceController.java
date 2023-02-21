package com.example.CSWS.controller;

import com.example.CSWS.entityAndDto.Instance;
import com.example.CSWS.entityAndDto.InstanceDto;
import com.example.CSWS.service.instance.InstanceCreateService;
import com.example.CSWS.service.instance.InstanceManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

// 필요한 클래스 앞에 @Service 어노테이션을 붙여줘야 인식한다.
// 서비스, 컨트롤러, 리포지토리 어노테이션은 모두 컴포넌트 어노테이션을 포함한다.
// 스프링 빈으로 자동 등록된다.
// = 컴포넌트 스캔. 여기에 오토 와이어드를 이용한 자동 의존관계로
// 서비스, 컨트롤러, 리포지토리를 연결한다.
@Controller
@RequiredArgsConstructor
public class InstanceController {

    private final InstanceCreateService instanceCreateService;
    private final InstanceManagementService instanceManagementService;

    @GetMapping("/instance/new")
    public String createForm() {
        return "forTest/instances/createInstanceForm";
    }

    @PostMapping("/instance/new")
    public String create(InstanceDto instanceDto) {
        Instance instance = new Instance();

        instance.setName(instanceDto.getName());
        instance.setId(instanceDto.getId());
        instance.setState(instanceDto.getState());
        instance.setStorage(instanceDto.getStorage());
        instance.setAddress(instanceDto.getAddress());
        instance.setPort(instanceDto.getPort());
        instance.setKeyName(instanceDto.getKeyName());
        instance.setOs(instanceDto.getOs());

//        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = null;
//        try {
//            date = date1.parse("2023-01-30");
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
        Date date = new Date();
        instance.setCreated(date);
        instance.setMemberId(instanceDto.getMemberId());

        instanceCreateService.createInstance(instance);

        return "redirect:/";
    }

    @GetMapping("/instances")
    public String findList(Model model) { return "forTest/instances/findInstances"; }

    @PostMapping("/instances")
    public String list(Model model, String instanceId) {
        // 임시로 하나만 있는지 확인
        Optional<Instance> instance = instanceManagementService.findInstanceDetail(instanceId);
        List<Instance> instances = new ArrayList<>();
        
        // 객체가 존재할 때만 리스트에 추가
        instance.ifPresent(instances::add);
        model.addAttribute("instances", instances);
        return "forTest/instances/instanceList";
    }
}
