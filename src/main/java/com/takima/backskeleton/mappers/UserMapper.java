package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.UserDTO;
import com.takima.backskeleton.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    
    public UserDTO toDto(User user){
        if (user == null) return null;
        return new UserDTO(user.getId(),
            user.getEmail(),
            user.getFirstName(),
            user.getLastName(),
            user.getPassword());
    }

    public User toEntity(UserDTO dto) {
        if (dto == null) return null;
        User user = new User();
        if (dto.getId() != null){
            user.setId(dto.getId());
        }
        user.setEmail(dto.getEmail());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());   
        user.setPassword(dto.getPassword());   
        return user;
    }

}
