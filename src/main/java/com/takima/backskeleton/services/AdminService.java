package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.AdminDAO;
import com.takima.backskeleton.models.Admin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
}
