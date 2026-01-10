package com.api.service;

import com.api.model.UserModel;
import com.api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // GET all users
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    // INSERT user (for future)
    public UserModel createUser(UserModel user) {
        return userRepository.save(user);
    }

    // DELETE user (for future)
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
