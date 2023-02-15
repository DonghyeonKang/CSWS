package com.example.CSWS.dashboard.boundPolicy;

import java.util.List;

public interface BoundPolicyService {

    public List<BoundPolicy> findAllInboundPolicy(String securityId);

    public List<BoundPolicy> findAllOutboundPolicy(String securityId);

    public boolean saveInboundPolicy(BoundPolicy inboundPolicy);

    public boolean saveOutboundPolicy(BoundPolicy outboundPolicy);

    public int deleteInboundPolicy(String securityId, BoundPolicy inboundPolicy);

    public int deleteOutboundPolicy(String securityId, BoundPolicy outboundPolicy);

}
