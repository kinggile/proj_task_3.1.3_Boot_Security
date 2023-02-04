package com.example.SpringBoot_Security.controller;

import com.example.SpringBoot_Security.repository.UserRepository;
import com.example.SpringBoot_Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.SpringBoot_Security.model.User;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;


@Controller
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping()
    public String info(HttpServletRequest request) {
        Principal principal = request.getUserPrincipal();
        return "user/userInfo";
    }
}
