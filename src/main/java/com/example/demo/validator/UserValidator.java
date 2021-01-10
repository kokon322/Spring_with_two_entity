package com.example.demo.validator;

import com.example.demo.entity.dto.UserRegistrationDto;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class UserValidator {
    public boolean validate(UserRegistrationDto dto) {
        return Objects.equals(dto.getPassword(), dto.getRepeatPassword());
    }
}
