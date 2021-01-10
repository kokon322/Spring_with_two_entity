package com.example.demo.services.impl;

import com.example.demo.entity.RoleName;
import com.example.demo.entity.User;
import com.example.demo.entity.dto.UserRegistrationDto;
import com.example.demo.entity.dto.UserResponseDto;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import com.example.demo.services.UserService;
import com.example.demo.validator.UserValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper mapper;
    private final UserValidator validator;
    private final UserRepository userRepository;


    @Override
    public UserResponseDto save(UserRegistrationDto dto) {
        if (validator.validate(dto)) {
            User user = mapper.getUser(dto);
            user.setRole(RoleName.USER);
            return mapper.getResponseDto(userRepository.save(user));
        }
        return null;
    }

    @Override
    public UserResponseDto readById(Long id) {
        return mapper.getResponseDto(userRepository.getOne(id));
    }

    @Override
    public List<UserResponseDto> readAll() {
        return userRepository.findAll()
                .stream()
                .map(mapper::getResponseDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
       userRepository.deleteById(id);
    }
}
