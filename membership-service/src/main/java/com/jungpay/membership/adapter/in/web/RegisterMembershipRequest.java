package com.jungpay.membership.adapter.in.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterMembershipRequest {

    private String name;
    private String address;
    private String mail;
    private boolean isCorp;
}
