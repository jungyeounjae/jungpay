package com.jungpay.membership.adapter.in.web;


import com.jungpay.membership.application.port.in.RegisterMembershipCommand;
import com.jungpay.membership.application.port.in.RegisterMembershipUseCase;
import com.jungpay.membership.common.WebAdapter;
import com.jungpay.membership.domain.Membership;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequiredArgsConstructor
public class RegisterMembershipController
{

    private final RegisterMembershipUseCase registerMembershipUseCase;
    @PostMapping(path ="/membership/register")
    Membership registerMembership(@RequestBody RegisterMembershipRequest request){
//        System.out.println("Received Request: " + request);
        RegisterMembershipCommand command = RegisterMembershipCommand.builder()
                .name(request.getName())
                .address(request.getAddress())
                .email(request.getMail())
                .isValid(true)
                .isCorp(request.isCorp())
                .build();

        return registerMembershipUseCase.registerMembership(command);
    }
}
