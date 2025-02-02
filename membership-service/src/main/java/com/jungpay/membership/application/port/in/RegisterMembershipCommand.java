package com.jungpay.membership.application.port.in;

import com.jungpay.membership.common.SelfValidating;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Builder
@Data
@EqualsAndHashCode(callSuper = false)
public
class RegisterMembershipCommand extends SelfValidating<RegisterMembershipCommand> {

    @NotNull
    private final String name;

    @NotNull
    @NotBlank
    private final String email;

    @NotNull
    private final String address;

    @AssertTrue
    private final boolean isValid;

    private final boolean isCorp;

    public RegisterMembershipCommand(
            String name,
            String email,
            String address,
            boolean isValid,
            boolean isCorp
    ) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.isValid = isValid;
        this.isCorp = isCorp;

         this.validateSelf();
        // constructor 를 생설할 때, constraints 들을 선언적으로 검사하게 해준다!
        // if name != null 과 같은 코드들이 생략 가능 함.
        // this.validateSelf();을 호출하지 않는다면 @NotNull 는 논리적선 선언에 지나지 않는다.
    }
}
