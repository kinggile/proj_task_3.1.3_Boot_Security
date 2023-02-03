package com.example.SpringBoot_Security.service;

import com.example.SpringBoot_Security.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getOneUser(Long id);

    void updateUser(User user);

    void saveUser(User user);

    void deleteUser(User user);

}
