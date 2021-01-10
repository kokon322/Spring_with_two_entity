package com.example.demo.services;

import com.example.demo.entity.dto.UserRegistrationDto;
import com.example.demo.entity.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto save(UserRegistrationDto dto);

    UserResponseDto readById(Long id);

    List<UserResponseDto> readAll();

    void deleteById(Long id);

}
