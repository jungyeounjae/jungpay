package com.jungpay.membership.application.service;


import com.jungpay.membership.application.port.in.RegisterMembershipCommand;
import com.jungpay.membership.application.port.in.RegisterMembershipUseCase;
import com.jungpay.membership.application.port.out.RegisterMembershipPort;
import com.jungpay.membership.common.UseCase;
import com.jungpay.membership.domain.Membership;
import com.jungpay.membership.out.persistence.MembershipJpaEntity;
import com.jungpay.membership.out.persistence.MembershipMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
@Transactional
public class RegisterMembership implements RegisterMembershipUseCase {

    private final RegisterMembershipPort registerMembershipPort;
    private final MembershipMapper membershipMapper;

    @Override
    public Membership registerMembership(RegisterMembershipCommand command) {
        MembershipJpaEntity jpaEntity = registerMembershipPort.createMembership(
                new Membership.MembershipName(command.getName()),
                new Membership.MembershipEmail(command.getEmail()),
                new Membership.MembershipAddress(command.getAddress()),
                new Membership.MembershipIsValid(command.isValid()),
                new Membership.MembershipISCorp(command.isCorp())
        );
        return membershipMapper.mapToDomainEntity(jpaEntity);
    }
}
