package com.example.CSWS.controller.user;

import com.example.CSWS.domain.user.RegisterRequest;
import com.example.CSWS.service.user.RegisterService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

import java.io.IOException;

@Slf4j  // logging framework in lombok
@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegisterController {
    private final RegisterService registerService;
    private final PasswordEncoder passwordEncoder;

    @PostMapping
    public Object register(@ModelAttribute RegisterRequest request) throws IOException {
        try {
            System.out.println("Controller start");
            request.setPassword(passwordEncoder.encode(request.getPassword()));  // password encoding
            registerService.register(request);
            return Map.of("result", "성공");  // 성공 리턴
        } catch (Exception e) {
            throw e;
        }
    }

    // checkEmail
}
