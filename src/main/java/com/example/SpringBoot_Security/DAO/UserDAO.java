package com.example.SpringBoot_Security.DAO;

import com.example.SpringBoot_Security.model.User;


import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();

    void save(User user);

    User getOneUser(Long id);

    public void updateUser(User user);
    void deleteUser(Long id);

}
