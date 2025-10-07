package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.AdminDTO;
import com.takima.backskeleton.mappers.AdminMapper;
import com.takima.backskeleton.models.Admin;
import com.takima.backskeleton.services.AdminService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/admins")
public class AdminController {

    private final AdminService adminService;
    private final AdminMapper adminMapper;

    public AdminController(AdminService adminService, AdminMapper adminMapper) {
        this.adminService = adminService;
        this.adminMapper = adminMapper;
    }

    @GetMapping
    public List<AdminDTO> getAllAdmins() {
        return adminService.getAllAdmins()
                .stream()
                .map(adminMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public AdminDTO getAdminById(@PathVariable Long id) {
        return adminService.getAdminById(id)
                .map(adminMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public AdminDTO createAdmin(@RequestBody AdminDTO adminDTO) {
        Admin admin = adminMapper.toEntity(adminDTO);
        return adminMapper.toDto(adminService.createAdmin(admin));
    }

    @PutMapping("/{id}")
    public AdminDTO updateAdmin(@PathVariable Long id, @RequestBody AdminDTO adminDTO) {
        Admin updated = adminMapper.toEntity(adminDTO);
        return adminMapper.toDto(adminService.updateAdmin(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable Long id) {
        adminService.deleteAdmin(id);
    }
}
