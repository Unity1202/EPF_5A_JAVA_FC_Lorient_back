package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.UserDAO;
import com.takima.backskeleton.models.User;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class userService {
    private final UserDAO userDAO;

    public userService(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    public List<User> getAllUsers(){
        return userDAO.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userDAO.findById(id);
    }

    public User createUser(User user){
        return userDAO.save(user);
    }

    public User deleteUser(Long id){
        User user = userDAO.findById(id)
        .orElseThrow(()->new RuntimeException("Utilisateur non trouvé" + id));
        userDAO.deleteById(id);
        return user;
    }
}
