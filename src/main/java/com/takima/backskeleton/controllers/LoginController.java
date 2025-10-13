package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.User;
import com.takima.backskeleton.DAO.UserDAO;
import org.springframework.web.bind.annotation.*;
import com.takima.backskeleton.services.UserService;

@RestController
@RequestMapping("/auth")
public class LoginController {
    private final UserDAO userDAO;
    private final UserService userService;

    public LoginController(UserDAO userDAO, UserService userService) {
        this.userDAO = userDAO;
        this.userService = userService;
    }
    
    @PostMapping("LoginUser")
    public boolean login(@RequestBody LoginRequest loginRequest){
        return userService.login(loginRequest.getEmail(), loginRequest.getPassword());
    }

    public static class LoginRequest {
        private String email;
        private String password;

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
    }
}
