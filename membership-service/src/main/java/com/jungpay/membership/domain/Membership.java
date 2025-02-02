package com.jungpay.membership.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

// 이 클래스는 오염이 되면 안되는 클래스이다.
// 왜냐, 고객 정보, 핵심 도메인이다. 마음대로 변경하면 안된다. 이것을 시스템적으로 구현하기 위해 private final로 햇다.
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Membership {
    /**
     * The baseline balance of the account. This was the balance of the account before the first
     * activity in the activityWindow.
     */
    @Getter
    private final String membershipId;
    @Getter
    private final String name;
    @Getter
    private final String email;
    @Getter
    private final String address;
    @Getter
    private final boolean isValid;
    @Getter
    private final boolean isCorp;

    public static Membership generateMember(
            MembershipId membershipId,
            MembershipName membershipName,
            MembershipEmail membershipEmail,
            MembershipAddress membershipAddress,
            MembershipIsValid membershipIsValid,
            MembershipISCorp membershipIsCorp
    ) {
        return new Membership(
                membershipId.membershipId,
                membershipName.nameValue,
                membershipEmail.emailValue,
                membershipAddress.addressValue,
                membershipIsValid.isValidValue,
                membershipIsCorp.isCorpValue
        );
    }

    @Value
    public static class MembershipId {
        public MembershipId(String value) {
            this.membershipId = value;
        }

        String membershipId;
    }

    @Value
    public static class MembershipName {
        public MembershipName(String value) {
            this.nameValue = value;
        }

        String nameValue;
    }

    @Value
    public static class MembershipEmail {
        public MembershipEmail(String value) {
            this.emailValue = value;
        }

        String emailValue;
    }

    @Value
    public static class MembershipAddress {
        public MembershipAddress(String value) {
            this.addressValue = value;
        }

        String addressValue;
    }

    @Value
    public static class MembershipIsValid {
        public MembershipIsValid(boolean value) {
            this.isValidValue = value;
        }

        boolean isValidValue;
    }

    @Value
    public static class MembershipISCorp {
        public MembershipISCorp(boolean value) {
            this.isCorpValue = value;
        }

        boolean isCorpValue;
    }
}