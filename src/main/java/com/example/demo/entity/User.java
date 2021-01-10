package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name") // annotation for change name.
    private String userName;
    private String password;
    @Enumerated(EnumType.STRING) // change Enum to String.
    private RoleName role;


}
