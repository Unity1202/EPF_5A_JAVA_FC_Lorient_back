package com.takima.backskeleton.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takima.backskeleton.DAO.UserDAO;
import com.takima.backskeleton.services.AdminService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

    private final UserDAO userDAO;
    private final AdminService adminService;

    public LoginController(UserDAO userDAO, AdminService adminService) {
        this.userDAO = userDAO;
        this.adminService = adminService;

    }

    @PostMapping("LoginUser")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        System.out.println("Tentative de connexion avec email: " + loginRequest.getEmail());

        // Vérifier si c'est un utilisateur (recherche insensible à la casse)
        String email = loginRequest.getEmail().trim();
        com.takima.backskeleton.models.User user = userDAO.findByEmailIgnoreCase(email);
        if (user == null) {
            // Essayer aussi avec la méthode normale au cas où
            user = userDAO.findByEmail(email);
        }

        if (user != null) {
            System.out.println("Utilisateur trouvé: " + user.getEmail() + ", ID: " + user.getId());
            System.out.println("Mot de passe fourni: " + loginRequest.getPassword());
            System.out.println("Mot de passe en base: " + user.getPassword());
            System.out.println("Correspondance: " + user.getPassword().equals(loginRequest.getPassword()));

            if (user.getPassword().equals(loginRequest.getPassword())) {
                LoginResponse response = new LoginResponse();
                response.setUserId((int) user.getId());
                response.setFirstName(user.getFirstName());
                response.setUserType("user");
                return ResponseEntity.ok(response);
            }
        } else {
            System.out.println("Aucun utilisateur trouvé avec cet email: " + loginRequest.getEmail());
        }

        // Vérifier si c'est un admin
        if (adminService.login(loginRequest.getEmail(), loginRequest.getPassword())) {
            LoginResponse response = new LoginResponse();
            response.setUserType("admin");
            return ResponseEntity.accepted().body(response);
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    public static class LoginRequest {

        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public static class LoginResponse {

        private int userId;
        private String firstName;
        private String userType;

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getUserType() {
            return userType;
        }

        public void setUserType(String userType) {
            this.userType = userType;
        }
    }
}
