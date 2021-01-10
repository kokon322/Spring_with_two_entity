package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.example.demo.entity.dto.UserRegistrationDto;
import com.example.demo.entity.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public User getUser(UserRegistrationDto dto) {
        User user = new User();
        user.setUserName(dto.getUserName());
        user.setPassword(dto.getPassword());
        return user;
    }

    public UserResponseDto getResponseDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setUserName(user.getUserName());
        dto.setId(user.getId());
        dto.setRole(user.getRole().name());
        return dto;
    }
}
