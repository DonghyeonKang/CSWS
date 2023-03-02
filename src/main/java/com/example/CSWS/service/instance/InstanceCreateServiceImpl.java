package com.example.CSWS.service.instance;

import com.example.CSWS.common.exception.EntityNotFoundException;
import com.example.CSWS.common.exception.ErrorCode;
import com.example.CSWS.common.shRunner.ShRunner;
import com.example.CSWS.domain.instance.Instance;
import com.example.CSWS.domain.instance.InstanceDto;
import com.example.CSWS.domain.user.User;
import com.example.CSWS.repository.instance.InstanceRepository;
import com.example.CSWS.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

//@Component
@Service
@RequiredArgsConstructor
public class InstanceCreateServiceImpl implements InstanceCreateService{

    private final int HOSTCODE_BASE = 2000;
    private final InstanceRepository instanceRepository;
    private final UserRepository userRepository;
    private final ShRunner shRunner;
    // private SecurityGroupService securityGroupService;
    // -> 키페어 생성을 위한 특정 유저, 인스턴스 조회에 필요한 서비스

    @Override
    public String createInstance(InstanceDto instanceDto) {
        
        // DB에 인스턴스 저장 후, 갱신된 프로시저 code가 포함된 entity 받아옴
        Instance newInstance = instanceRepository.save(instanceDto.toEntity());
        int code = newInstance.getCode();
        String hostPort = Integer.toString(HOSTCODE_BASE + code); // 코드를 이용해 호스트 포트 임의 결정

        // 원래는 user의 String id를 넣어서 이름(닉네임)을 뽑아와야 하는데, 엔티티 및 리포지토리에 필드가 없음.
        // 임시로 email을 넣어서 이름을 뽑아오는 메서드로 위치를 대체함.
        // 추후 수정 필요.
        User user = userRepository.findByUsername(instanceDto.getMemberId())
                .orElseThrow(() -> new EntityNotFoundException(ErrorCode.USER_NOT_FOUND));
        String username = user.getUsername();

        try {
            shRunner.execCommand("CreateContainer.sh", hostPort, // 호스트 포트(임의 설정)
                    Integer.toString(instanceDto.getPort()), // 컨테이너 포트(유저 설정)
                    username, // 유저 '이름'
                    Integer.toString(code), // code
                    Double.toString(instanceDto.getStorage()), // 용량
                    instanceDto.getOs()); // 컨테이너 이미지(유저가 정한 OS)
            return "success";
        } catch (Exception e) {
            return e.toString();
        }

    }

    @Override
    public String createKeyPair(String userName, String instanceId) {
        instanceRepository.findById(instanceId);
        // securityGroupService.findSecurityGroup(userName);
        return "";
    }
}
