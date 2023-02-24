package com.example.CSWS.service.user;

import com.example.CSWS.common.exception.EntityNotFoundException;
import com.example.CSWS.common.exception.ErrorCode;
import com.example.CSWS.repository.user.UserRepository;
import com.example.CSWS.domain.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component  // component scan 방식으로 빈 등록. Repository 해도 상관없음
@RequiredArgsConstructor // private 필드를 생성자 주입으로 DI 구현
public class UserService {  // 사용자 회원가입, 사용자 정보 불러오기
    private final UserRepository userRepository;

    // 회원 조회
    public User getUser(String email) {
        return userRepository.findByUsername(email)
                .orElseThrow(() -> new EntityNotFoundException(ErrorCode.USER_NOT_FOUND));
    }
}
