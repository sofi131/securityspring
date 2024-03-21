package com.ceica.securityspring.controller;

import com.ceica.securityspring.model.User;
import com.ceica.securityspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class loginController {
    private UserService userService;

    @Autowired
    public loginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String postRegister(@ModelAttribute User user) {

        userService.crearUsuario(user);
        System.out.println(user);
        return "register";
    }

}