package com.example.CSWS.dashboard.security;

import java.util.List;

public interface BoundPolicyService {

    public List<BoundPolicy> findAllInboundPolicy(String securityId);

    public List<BoundPolicy> findAllOutboundPolicy(String securityId);

    public int saveInboundPolicy(String securityId);

    public int saveOutboundPolicy(String securityId);

    public int deleteInboundPolicy(String securityId, BoundPolicy inboundPolicy);

    public int deleteOutboundPolicy(String securityId, BoundPolicy outboundPolicy);

}
