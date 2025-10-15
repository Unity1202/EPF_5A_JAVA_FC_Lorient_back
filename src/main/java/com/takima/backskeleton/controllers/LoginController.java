package com.takima.backskeleton.controllers;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takima.backskeleton.DAO.UserDAO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.takima.backskeleton.services.AdminService;
import com.takima.backskeleton.services.UserService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
    @SuppressWarnings("unused")
    private final UserDAO userDAO;
    private final UserService userService;
    private final AdminService adminService;

    public LoginController(UserDAO userDAO, UserService userService, AdminService adminService) {
        this.userDAO = userDAO;
        this.userService = userService;
        this.adminService = adminService;

    }
    
    @PostMapping("LoginUser")
    public ResponseEntity<Void> login(@RequestBody LoginRequest loginRequest) {
        if (userService.login(loginRequest.getEmail(), loginRequest.getPassword())) {
            return ResponseEntity.ok().build();
        } else if (adminService.login(loginRequest.getEmail(), loginRequest.getPassword())) {
            return ResponseEntity.accepted().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
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
