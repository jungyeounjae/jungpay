package com.jungpay.membership.application.port.out;

import com.jungpay.membership.domain.Membership;
import com.jungpay.membership.out.persistence.MembershipJpaEntity;

public interface RegisterMembershipPort {

    MembershipJpaEntity createMembership(
            Membership.MembershipName membershipName
            , Membership.MembershipEmail membershipEmail
            , Membership.MembershipAddress membershipAddress
            , Membership.MembershipIsValid membershipIsValid
            , Membership.MembershipISCorp membershipISCorp
    );
}
