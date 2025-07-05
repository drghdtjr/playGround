package com.small.personal.domain.user.service;

import com.small.personal.domain.user.dto.request.UserRequestDto;



public interface UserService {

  Long signup(UserRequestDto userRequestDto);
}
