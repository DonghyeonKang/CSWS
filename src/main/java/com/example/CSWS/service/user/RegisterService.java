package com.example.CSWS.service.user;

import com.example.CSWS.common.exception.ErrorCode;
import com.example.CSWS.common.exception.RegisterException;
import com.example.CSWS.domain.user.RegisterRequest;
import com.example.CSWS.domain.user.User;
import com.example.CSWS.domain.user.UserDto;
import com.example.CSWS.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j  // logging framework
@Component  // 컴포넌트 스캔 방식으로 빈 등록
@RequiredArgsConstructor // private field 생성자 주입으로 DI 구현
public class RegisterService {
    final UserRepository userRepository;

    public User register(RegisterRequest registerRequest) {
        System.out.println("Register Service start");
        // 회원가입 검증절차
        validateRegisterRequest(registerRequest);
        UserDto userDto = extractUser(registerRequest);
        // 로그 남기기
        log.debug("user = {}", userDto);
        // dto to entity
        User user = userDto.toEntity();
        // jpa의 save
        return userRepository.save(user);

    }

    private void validateRegisterRequest(RegisterRequest registerRequest) { // 회원가입 검증
        System.out.println("validateRegisterRequest start");
        // 이메일 중복 검증
        validateDuplicateEmail(registerRequest.getUsername());
    }

    private void validateDuplicateEmail(String email) {
        System.out.println("validateDuplicateEmail start");
        if (userRepository.findByUsername(email).isPresent()) { // isPresent value 가 있으면 true, 없으면 false return
            throw new RegisterException(ErrorCode.DUPLICATED_EMAIL);
        }
    }

    private UserDto extractUser(RegisterRequest request) {
        UserDto user = request.toUserDto();
        user.setRole("ROLE_USER");
        return user;
    }
}
