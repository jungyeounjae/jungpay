package com.jungpay.membership.application.port.out;

import com.jungpay.membership.domain.Membership;
import com.jungpay.membership.out.persistence.MembershipJpaEntity;

public interface FindMembershipPort {

    MembershipJpaEntity findMembership(
            Membership.MembershipId membershipId
    );
}
