package com.example.CSWS.service.boundPolicy;

import com.example.CSWS.entityAndDto.BoundPolicyDto;

import java.util.List;

public interface BoundPolicyService {

    public List<BoundPolicyDto> findAllInboundPolicy(String securityId);

    public List<BoundPolicyDto> findAllOutboundPolicy(String securityId);

    public boolean saveInboundPolicy(BoundPolicyDto inboundPolicy);

    public boolean saveOutboundPolicy(BoundPolicyDto outboundPolicy);

    public int deleteInboundPolicy(String securityId, BoundPolicyDto inboundPolicy);

    public int deleteOutboundPolicy(String securityId, BoundPolicyDto outboundPolicy);

}
