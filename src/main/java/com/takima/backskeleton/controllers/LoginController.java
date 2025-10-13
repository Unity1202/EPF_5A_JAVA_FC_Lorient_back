package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.User;
import com.takima.backskeleton.DAO.UserDAO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class LoginController {
    private final UserDAO userDAO;

    public LoginController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    @PostMapping("LoginUser")
    public boolean login(String email, String password){
        User user = userDAO.findByEmail(email);
        return user != null && user.getPassword()==password;
    }
}
