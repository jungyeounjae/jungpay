package com.jungpay.membership.application.port.in;

import com.jungpay.membership.domain.Membership;

public interface RegisterMembershipUseCase {

    // 📌Command Object メモ： https://qiita.com/jungyeounjae/items/b0af2fd6dbfa0c1faa2e
    Membership registerMembership(RegisterMembershipCommand command);
}
