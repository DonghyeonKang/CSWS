package com.example.CSWS.service.boundPolicy;

import com.example.CSWS.domain.boundPolicy.BoundPolicy;
import com.example.CSWS.domain.boundPolicy.BoundPolicyDto;

import java.util.List;

public interface BoundPolicyService {

    public List<BoundPolicy> findAllInboundPolicy(String securityId);

    public List<BoundPolicy> findAllOutboundPolicy(String securityId);

    public BoundPolicy saveInboundPolicy(BoundPolicyDto inboundPolicy);

    public BoundPolicy saveOutboundPolicy(BoundPolicyDto outboundPolicy);

    public int deleteInboundPolicy(String securityId, BoundPolicyDto inboundPolicy);

    public int deleteOutboundPolicy(String securityId, BoundPolicyDto outboundPolicy);

}
