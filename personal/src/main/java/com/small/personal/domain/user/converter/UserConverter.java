package com.small.personal.domain.user.converter;

import com.small.personal.domain.user.dto.request.UserRequestDto;
import com.small.personal.domain.user.entity.User;



public class UserConverter {
  public static User toEntity(UserRequestDto userRequestDto){
    return User.builder()
        .username(userRequestDto.getName())
        .password(userRequestDto.getPassword())
        .build();
  }

}
