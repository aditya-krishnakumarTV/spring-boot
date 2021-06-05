package com.aditya.spring.Service;

import com.aditya.spring.Exception.UserNotFoundExcption;
import com.aditya.spring.Model.User;
import com.aditya.spring.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    //Methods

    public User addUser(User user){
        return userRepo.save(user);
    }

    public User updateUser(User user){
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

    public List<User> findAllUser(){
        return userRepo.findAll();
    }

    public User findUserById(Long id){
        return userRepo.findUserById(id)
                .orElseThrow(() -> new UserNotFoundExcption("User not found!"));
    }
}
