package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.UserDAO;
import com.takima.backskeleton.models.User;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDAO userDAO;

    public UserService(UserDAO userDAO){
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

    public User updateUser(Long id, User updatedUser) {
        return userDAO.findById(id)
                .map(user -> {
                    user.setFirstName(updatedUser.getFirstName());
                    user.setLastName(updatedUser.getLastName());
                    user.setEmail(updatedUser.getEmail());
                    return userDAO.save(user);
                })
                .orElse(null);
    }

    public User deleteUser(Long id){
        User user = userDAO.findById(id)
        .orElseThrow(()->new RuntimeException("Utilisateur non trouvé" + id));
        userDAO.deleteById(id);
        return user;
    }

    public boolean login(String email, String password){
        User user = userDAO.findByEmail(email);
        return user != null && user.getPassword() == password;
    }
}
