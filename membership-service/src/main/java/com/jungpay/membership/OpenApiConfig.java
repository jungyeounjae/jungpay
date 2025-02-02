package com.jungpay.membership;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "Membership API",
                version = "1.0",
                description = "회원 관리 API"
        )
)
@Configuration
public class OpenApiConfig {
}
