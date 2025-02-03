package com.jungpay.membership.application.port.in;

import com.jungpay.membership.domain.Membership;

public interface FindMembershipUseCase {

    Membership findMembership(FindMembershipCommand command);
}
