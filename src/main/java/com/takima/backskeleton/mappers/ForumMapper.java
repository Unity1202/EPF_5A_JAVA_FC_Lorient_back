package com.takima.backskeleton.mappers;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.takima.backskeleton.DAO.UserDAO;
import com.takima.backskeleton.DTO.ForumDTO;
import com.takima.backskeleton.models.Forum;
import com.takima.backskeleton.models.User;

@Component
public class ForumMapper {

    private final UserDAO userDAO;

    public ForumMapper(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public ForumDTO toDto(Forum forum) {
        if (forum == null) {
            return null;
        }

        // Récupérer le prénom de l'utilisateur
        String firstName = null;
        Optional<User> user = userDAO.findById((long) forum.getUserId());
        if (user.isPresent()) {
            firstName = user.get().getFirstName();
        }

        return new ForumDTO(
                forum.getId(),
                forum.getUserId(),
                firstName,
                forum.getMessage(),
                forum.getCreatedAt()
        );
    }

    public Forum toEntity(ForumDTO dto) {
        if (dto == null) {
            return null;
        }
        Forum forum = new Forum();
        forum.setId(dto.getId());
        forum.setUserId(dto.getUserId());
        forum.setMessage(dto.getMessage());
        forum.setCreatedAt(dto.getCreatedAt());
        return forum;
    }
}
