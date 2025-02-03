package com.jungpay.membership.application.service;


import com.jungpay.membership.application.port.in.FindMembershipCommand;
import com.jungpay.membership.application.port.in.FindMembershipUseCase;
import com.jungpay.membership.application.port.out.FindMembershipPort;
import com.jungpay.membership.common.UseCase;
import com.jungpay.membership.domain.Membership;
import com.jungpay.membership.out.persistence.MembershipJpaEntity;
import com.jungpay.membership.out.persistence.MembershipMapper;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
@Transactional
public class FindMembership implements FindMembershipUseCase {

    private final FindMembershipPort findMembershipPort;
    private final MembershipMapper membershipMapper;

    @Override
    public Membership findMembership(FindMembershipCommand command) {
        MembershipJpaEntity entity = findMembershipPort.findMembership(new Membership.MembershipId(command.getMembershipId()));
        return membershipMapper.mapToDomainEntity(entity);
    }
}
