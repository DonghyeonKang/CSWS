package com.example.CSWS.service.boundPolicy;

import com.example.CSWS.entityAndDto.BoundPolicyDto;
import com.example.CSWS.repository.boundPolicy.BoundPolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BoundPolicyServiceImpl implements BoundPolicyService{

    private final BoundPolicyRepository boundPolicyRepository;

//    public BoundPolicyServiceImpl(BoundPolicyRepository boundPolicyRepository) {
//        this.boundPolicyRepository = boundPolicyRepository;
//    }

    @Override
    public List<BoundPolicyDto> findAllInboundPolicy(String securityId) {
        // DB에서 해당 securityId에 대응되는 인바운드 정책들 조회
        List<BoundPolicyDto> inbounds = boundPolicyRepository.findAllInboundPolicy(securityId);

        return inbounds;
    }

    @Override
    public List<BoundPolicyDto> findAllOutboundPolicy(String securityId) {
        // DB에서 해당 securityId에 대응되는 아웃바운드 정책들 조회
        List<BoundPolicyDto> outbounds = boundPolicyRepository.findAllOutboundPolicy(securityId);

        return outbounds;
    }

    @Override
    public boolean saveInboundPolicy(BoundPolicyDto inboundPolicy) {
        // InboundPolicy 테이블에 해당 securityId에 대응되도록 인바운드 정책 추가
        // 성공시 1 반환, 에러 발생 시 0 반환.
        if (boundPolicyRepository.saveInboundPolicy(inboundPolicy) != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean saveOutboundPolicy(BoundPolicyDto outboundPolicy) {
        // OutboundPolicy 테이블에 해당 securityId에 대응되도록 아웃바운드 정책 추가
        // 성공 시 1 반환, 에러 발생 시 0 반환.
        if (boundPolicyRepository.saveOutboundPolicy(outboundPolicy) != null) {
            return true;
        }
        return false;
    }

    @Override
    public int deleteInboundPolicy(String securityId, BoundPolicyDto inboundPolicy) {
        // 해당 securityId 및 inboundPolicy 정책과 완전히 일치하는 row 삭제
        // 성공 시 1, 실패 시 0 반환
        return boundPolicyRepository.deleteInboundPolicy(securityId, inboundPolicy);
    }

    @Override
    public int deleteOutboundPolicy(String securityId, BoundPolicyDto outboundPolicy) {
        // 해당 securityId 및 outboundPolicy 정책과 완전히 일치하는 row 삭제
        // 성공 시 1, 실패 시 0 반환
        return boundPolicyRepository.deleteOutboundPolicy(securityId, outboundPolicy);
    }
}
