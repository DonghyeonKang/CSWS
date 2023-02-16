package com.example.CSWS.repository.boundPolicy;

import com.example.CSWS.dto.BoundPolicyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class MemoryBoundPolicyRepository implements BoundPolicyRepository{

    private static List<BoundPolicyDto> inbounds = new ArrayList<>();
    private static List<BoundPolicyDto> outbounds = new ArrayList<>();

    @Override
    public List<BoundPolicyDto> findAllInboundPolicy(String securityId) {

        List<BoundPolicyDto> in = new ArrayList<>();

        for (BoundPolicyDto inbound : inbounds) {
            if (securityId.equals(inbound.getSecurityId()))
                in.add(inbound);
        }

        return in;
    }

    @Override
    public List<BoundPolicyDto> findAllOutboundPolicy(String securityId) {

        List<BoundPolicyDto> out = new ArrayList<>();

        for (BoundPolicyDto outbound : outbounds) {
            if (securityId.equals(outbound.getSecurityId()))
                out.add(outbound);
        }

        return out;
    }

    @Override
    public BoundPolicyDto saveInboundPolicy(BoundPolicyDto inboundPolicy) {

        inbounds.add(inboundPolicy);
        return inboundPolicy;
    }

    @Override
    public BoundPolicyDto saveOutboundPolicy(BoundPolicyDto outboundPolicy) {

        outbounds.add(outboundPolicy);
        return outboundPolicy;
    }

    @Override
    public int deleteInboundPolicy(String securityId, BoundPolicyDto inboundPolicy) {

        for (BoundPolicyDto inbound : inbounds) {
            if (inbound.equals(inboundPolicy)) {
                inbounds.remove(inbound);
                return 1;
            }
        }

        return 0;
    }

    @Override
    public int deleteOutboundPolicy(String securityId, BoundPolicyDto outboundPolicy) {

        for (BoundPolicyDto outbound : outbounds) {
            if (outbound.equals(outboundPolicy)) {
                outbounds.remove(outbound);
                return 1;
            }
        }

        return 0;
    }
}
