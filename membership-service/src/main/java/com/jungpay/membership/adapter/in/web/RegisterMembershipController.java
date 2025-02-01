package com.jungpay.membership.adapter.in.web;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterMembershipController
{

    // http로의 요청과의 첫 상호작용을 하는, 부외부에서 내부로 들어오는 어댑터라고 할 수 있다.
    // 인바윤둟 들어오는 웹 형식의 어댑터 == 컨트롤러
    @GetMapping(path ="/test")
    void test() {
        System.out.println("hello!");
    }
}
