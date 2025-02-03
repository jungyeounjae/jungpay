package com.jungpay.membership.application.port.in;

import com.jungpay.membership.common.SelfValidating;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public
class FindMembershipCommand extends SelfValidating<FindMembershipCommand> {
    private final String membershipId;

}
