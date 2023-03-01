package com.example.CSWS.service.securityGroup;

import com.example.CSWS.domain.securityGroup.Relation;
import com.example.CSWS.domain.securityGroup.SecurityGroup;
import com.example.CSWS.domain.securityGroup.SecurityGroupDto;
import com.example.CSWS.repository.securityGroup.RelationRepository;
import com.example.CSWS.service.boundPolicy.BoundPolicyService;
import com.example.CSWS.repository.securityGroup.SecurityGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SecurityGroupServiceImpl implements SecurityGroupService{

    private final SecurityGroupRepository securityGroupRepository;
    private final RelationRepository relationRepository;
    private final BoundPolicyService boundPolicyService;

//    public SecurityGroupServiceImpl(SecurityGroupRepository securityGroupRepository, BoundPolicyService boundPolicyService) {
//        this.securityGroupRepository = securityGroupRepository;
//        this.boundPolicyService = boundPolicyService;
//    }

    @Override
    public Optional<SecurityGroup> findSecurityGroup(String instanceId) {
        
        // instanceId를 이용해 DB의 relation에서 대응되는 securityId 가져오기
        Optional<Relation> relation = relationRepository.findById(instanceId);
        if (relation.isEmpty()) {
            return null;
        }
        String securityId = relation.get().getSecurityId();

        // DB에서 securityId를 이용해 해당하는 보안그룹 row 가져오기
        return securityGroupRepository.findById(securityId);
    }

    public SecurityGroup createSecurityGroup(String instanceId, SecurityGroupDto newSecurityGroupDto) {

        // intanceId에 대응되는 securityId 생성
        String securityId = "";

        // DB relation 테이블에 저장
        Relation newRelation = new Relation(instanceId, securityId);
        relationRepository.save(newRelation);

        // DB에 securityGroup 저장
        return securityGroupRepository.save(newSecurityGroupDto.toEntity());
    }
}
