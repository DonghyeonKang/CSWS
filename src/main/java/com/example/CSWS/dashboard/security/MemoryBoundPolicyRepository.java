package com.example.CSWS.dashboard.security;

import java.util.ArrayList;
import java.util.List;

public class MemoryBoundPolicyRepository implements BoundPolicyRepository{

    private static List<BoundPolicy> inbounds = new ArrayList<>();
    private static List<BoundPolicy> outbounds = new ArrayList<>();

    @Override
    public List<BoundPolicy> findAllInboundPolicy(String securityId) {

        List<BoundPolicy> in = new ArrayList<>();

        for (BoundPolicy inbound : inbounds) {
            if (securityId.equals(inbound.getSecurityId()))
                in.add(inbound);
        }

        return in;
    }

    @Override
    public List<BoundPolicy> findAllOutboundPolicy(String securityId) {

        List<BoundPolicy> out = new ArrayList<>();

        for (BoundPolicy outbound : outbounds) {
            if (securityId.equals(outbound.getSecurityId()))
                out.add(outbound);
        }

        return out;
    }

    @Override
    public BoundPolicy saveInboundPolicy(BoundPolicy inboundPolicy) {

        inbounds.add(inboundPolicy);
        return inboundPolicy;
    }

    @Override
    public BoundPolicy saveOutboundPolicy(BoundPolicy outboundPolicy) {

        outbounds.add(outboundPolicy);
        return outboundPolicy;
    }

    @Override
    public int deleteInboundPolicy(String securityId, BoundPolicy inboundPolicy) {

        for (BoundPolicy inbound : inbounds) {
            if (inbound.equals(inboundPolicy)) {
                inbounds.remove(inbound);
                return 1;
            }
        }

        return 0;
    }

    @Override
    public int deleteOutboundPolicy(String securityId, BoundPolicy outboundPolicy) {

        for (BoundPolicy outbound : outbounds) {
            if (outbound.equals(outboundPolicy)) {
                outbounds.remove(outbound);
                return 1;
            }
        }

        return 0;
    }
}
