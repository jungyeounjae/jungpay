package com.jungpay.membership.out.persistence;

import com.jungpay.membership.domain.Membership;
import org.springframework.stereotype.Component;

@Component
public class MembershipMapper {

    public Membership mapToDomainEntity(
            MembershipJpaEntity membership
    ) {
        return Membership.generateMember(
                new Membership.MembershipId(membership.getMembershipId() + ""),
                new Membership.MembershipName(membership.getName()),
                new Membership.MembershipEmail(membership.getEmail()),
                new Membership.MembershipAddress(membership.getAddress()),
                new Membership.MembershipIsValid(membership.isValid()),
                new Membership.MembershipISCorp(membership.isCorp())
        );
    }
}
