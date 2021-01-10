package com.example.demo.repository;

import com.example.demo.entity.RoleName;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//Save to DB it is a magick of reptiles
public interface UserRepository extends JpaRepository<User, Long> {
      List<User> findAllByRole (RoleName name);
}
