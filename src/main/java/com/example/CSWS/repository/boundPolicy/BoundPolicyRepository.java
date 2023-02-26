package com.example.CSWS.repository.boundPolicy;

import com.example.CSWS.entityAndDto.BoundPolicy;
import com.example.CSWS.entityAndDto.BoundPolicyDto;

import java.util.List;
import java.util.Optional;

public interface BoundPolicyRepository {

//    public List<BoundPolicyDto> findAllInboundPolicy(String securityId);
//
//    public List<BoundPolicyDto> findAllOutboundPolicy(String securityId);

    public List<BoundPolicy> findAllById(Iterable<String> securityId);

//    public BoundPolicyDto saveInboundPolicy(BoundPolicyDto inboundPolicy);
//
//    public BoundPolicyDto saveOutboundPolicy(BoundPolicyDto outboundPolicy);

    public BoundPolicy save(BoundPolicy boundPolicy);

//    public int deleteInboundPolicy(String securityId, BoundPolicyDto inboundPolicy);
//
//    public int deleteOutboundPolicy(String securityId, BoundPolicyDto outboundPolicy);

    public void delete(BoundPolicy boundPolicy);

}
