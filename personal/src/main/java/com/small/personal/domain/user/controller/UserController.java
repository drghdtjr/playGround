package com.small.personal.domain.user.controller;


import com.small.personal.domain.user.dto.request.UserRequestDto;
import com.small.personal.domain.user.service.UserService;
import com.small.personal.global.common.CustomApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "User", description = "회원관리 API")
@RequestMapping("/api/v1/users")
@RestController
@RequiredArgsConstructor

public class UserController {

  private final UserService userService;

  @Operation(summary = "회원가입", description = "회원가입을 처리합니다.")
  @PostMapping("/signup")
  public ResponseEntity<CustomApiResponse<Long>> signup(
      @RequestBody UserRequestDto userRequestDto) {
    Long userId = userService.signup(userRequestDto);
    return ResponseEntity.ok(CustomApiResponse.onSuccess(userId));
  }
}