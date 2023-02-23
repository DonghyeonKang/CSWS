package com.example.CSWS.service.user;

import com.example.CSWS.common.exception.ErrorCode;
import com.example.CSWS.common.exception.RegisterException;
import com.example.CSWS.entityAndDto.user.RegisterRequest;
import com.example.CSWS.entityAndDto.user.User;
import com.example.CSWS.entityAndDto.user.UserDto;
import com.example.CSWS.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j  // logging framework
@Component  // 컴포넌트 스캔 방식으로 빈 등록
@RequiredArgsConstructor // private field 생성자 주입으로 DI 구현
public class RegisterService {
    private UserRepository userRepository;

    public User register(RegisterRequest registerRequest) {
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
        // 이메일 중복 검증
        validateDuplicateEmail(registerRequest.getEmail());
    }

    private void validateDuplicateEmail(String email) {
        if (userRepository.findByUsername(email).isPresent()) {
            throw new RegisterException(ErrorCode.DUPLICATED_EMAIL);
        }
    }

    private UserDto extractUser(RegisterRequest request) {
        UserDto user = request.toUserDto();
        user.setRole("ROLE_USER");
        return user;
    }
}
