package com.small.personal.domain.user.service;

import com.small.personal.domain.user.dto.request.UserRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserServiceImpl implements UserService {

  @Override
  @Transactional(readOnly = true)
  public Long signup(UserRequestDto userRequestDto) {
    return null;

  }
}
