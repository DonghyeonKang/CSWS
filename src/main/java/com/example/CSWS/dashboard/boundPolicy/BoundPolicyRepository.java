package com.example.CSWS.dashboard.boundPolicy;

import java.util.List;

public interface BoundPolicyRepository {

    public List<BoundPolicy> findAllInboundPolicy(String securityId);

    public List<BoundPolicy> findAllOutboundPolicy(String securityId);

    public BoundPolicy saveInboundPolicy(BoundPolicy inboundPolicy);

    public BoundPolicy saveOutboundPolicy(BoundPolicy outboundPolicy);

    public int deleteInboundPolicy(String securityId, BoundPolicy inboundPolicy);

    public int deleteOutboundPolicy(String securityId, BoundPolicy outboundPolicy);

}
