package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.AdminDTO;
import com.takima.backskeleton.models.Admin;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {
    public AdminDTO toDto(Admin admin) {
        if (admin == null) return null;
        return new AdminDTO(
            admin.getId(),
            admin.getFirstName(),
            admin.getLastName(),
            admin.getEmail(),
            admin.getPassword()
        );
    }

    public Admin toEntity(AdminDTO dto) {
        if (dto == null) return null;
        Admin admin = new Admin();
        admin.setId(dto.getId());
        admin.setFirstName(dto.getFirstName());
        admin.setLastName(dto.getLastName());
        admin.setEmail(dto.getEmail());
        admin.setPassword(dto.getPassword());
        return admin;
    }
}
