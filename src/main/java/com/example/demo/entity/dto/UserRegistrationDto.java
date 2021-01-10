package com.example.demo.entity.dto;

import lombok.Data;

@Data
public class UserRegistrationDto {
    private String userName;
    private String password;
    private String repeatPassword;
}
