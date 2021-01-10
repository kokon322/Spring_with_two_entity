package com.example.demo.controller;

import com.example.demo.entity.dto.UserRegistrationDto;
import com.example.demo.entity.dto.UserResponseDto;
import com.example.demo.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public UserResponseDto save(@RequestBody UserRegistrationDto dto){
        return userService.save(dto);
    }

    @GetMapping("/all")
    public List<UserResponseDto> readAll(){
        return userService.readAll();
    }

    @GetMapping ("/{id}")
    public UserResponseDto readById(@PathVariable Long id){
        return userService.readById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    };
}
