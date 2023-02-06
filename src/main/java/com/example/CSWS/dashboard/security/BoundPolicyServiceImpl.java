package com.example.CSWS.dashboard.security;

import java.util.ArrayList;
import java.util.List;

public class BoundPolicyServiceImpl implements BoundPolicyService{

    private final BoundPolicyRepository boundPolicyRepository;

    public BoundPolicyServiceImpl(BoundPolicyRepository boundPolicyRepository) {
        this.boundPolicyRepository = boundPolicyRepository;
    }

    @Override
    public List<BoundPolicy> findAllInboundPolicy(String securityId) {
        // DB에서 해당 securityId에 대응되는 인바운드 정책들 조회
        List<BoundPolicy> inbounds = new ArrayList<>();
        return inbounds;
    }

    @Override
    public List<BoundPolicy> findAllOutboundPolicy(String securityId) {
        // DB에서 해당 securityId에 대응되는 아웃바운드 정책들 조회
        List<BoundPolicy> outbounds = new ArrayList<>();
        return outbounds;
    }

    @Override
    public int saveInboundPolicy(String securityId) {
        // InboundPolicy 테이블에 해당 securityId에 대응되도록 인바운드 정책 추가
        // 성공시 1 반환, 에러 발생 시 0 반환.
        List<BoundPolicy> inbounds = new ArrayList<>();
        return 0;
    }

    @Override
    public int saveOutboundPolicy(String securityId) {
        // OutboundPolicy 테이블에 해당 securityId에 대응되도록 아웃바운드 정책 추가
        // 성공 시 1 반환, 에러 발생 시 0 반환.
        List<BoundPolicy> outbounds = new ArrayList<>();
        return 0;
    }

    @Override
    public int deleteInboundPolicy(String securityId, BoundPolicy inboundPolicy) {
        // 해당 securityId 및 inboundPolicy 정책과 완전히 일치하는 row 삭제
        // 성공 시 1, 실패 시 0 반환
        return 0;
    }

    @Override
    public int deleteOutboundPolicy(String securityId, BoundPolicy outboundPolicy) {
        // 해당 securityId 및 outboundPolicy 정책과 완전히 일치하는 row 삭제
        // 성공 시 1, 실패 시 0 반환
        return 0;
    }
}
