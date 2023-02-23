package com.example.CSWS.entityAndDto.user;

import lombok.*;
import org.springframework.web.multipart.MultipartFile;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {  // 회원 가입 요청으로 들어오는 데이터를 넣을 DTO
    @Email
    @NotBlank
    private String email;
    @NotBlank
    private String password;

    public UserDto toUserDto() {
        return UserDto.builder()
                .username(email)
                .password(password)
                .build();
    }
}
