package com.takima.backskeleton.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.takima.backskeleton.DAO.AdminDAO;
import com.takima.backskeleton.models.Admin;

@Service
public class AdminService {

    private final AdminDAO adminDAO;

    public AdminService(AdminDAO adminDAO) {
        this.adminDAO = adminDAO;
    }

    public List<Admin> getAllAdmins() {
        return adminDAO.findAll();
    }

    public Optional<Admin> getAdminById(Long id) {
        return adminDAO.findById(id);
    }

    public Admin createAdmin(Admin admin) {
        return adminDAO.save(admin);
    }

    public Admin updateAdmin(Long id, Admin adminDetails) {
        return adminDAO.findById(id).map(admin -> {
            admin.setFirstName(adminDetails.getFirstName());
            admin.setLastName(adminDetails.getLastName());
            admin.setEmail(adminDetails.getEmail());
            admin.setPassword(adminDetails.getPassword());
            return adminDAO.save(admin);
        }).orElse(null);
    }

    public void deleteAdmin(Long id) {
        adminDAO.deleteById(id);
    }

    public boolean login(String email, String password) {
        System.out.println("salut, on test les admins");
        Admin admin = adminDAO.findByEmail(email);
        if (admin != null) {
            System.out.println("voici l'admin trouvé : " + admin);
        } else {
            System.out.println("aucun admin n'a été trouvééé");
        }
        return admin != null && admin.getPassword().equals(password);
    }

    public Admin getAdminByEmail(String email) {
        return adminDAO.findByEmail(email);
    }
}
