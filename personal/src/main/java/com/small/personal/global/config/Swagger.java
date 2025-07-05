package com.small.personal.global.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;

public class Swagger {
  @Bean
  public OpenAPI openAPI() {
    return new OpenAPI()
        .components(new Components()
            .addSecuritySchemes("bearerAuth", securityScheme()))  // 보안 스키마 추가
        .info(apiInfo())
        .addSecurityItem(new SecurityRequirement().addList("bearerAuth"));  // 보안 요구 사항 추가
  }

  private Info apiInfo() {
    return new Info()
        .title("JETT Springdoc")
        .description("Springdoc을 사용한 Jett Swagger UI")
        .version("1.0.0");
  }

  private SecurityScheme securityScheme() {
    return new SecurityScheme()
        .type(SecurityScheme.Type.HTTP)
        .scheme("bearer")
        .bearerFormat("JWT");
  }
}
