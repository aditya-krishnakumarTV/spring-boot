package com.aditya.spring.Repo;

import com.aditya.spring.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findUserById(Long id);
}
