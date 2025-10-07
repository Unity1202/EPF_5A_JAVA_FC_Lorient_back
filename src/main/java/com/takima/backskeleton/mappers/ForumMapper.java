package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.ForumDTO;
import com.takima.backskeleton.models.Forum;
import org.springframework.stereotype.Component;

@Component
public class ForumMapper {
    public ForumDTO toDto(Forum forum) {
        if (forum == null) return null;
        return new ForumDTO(
            forum.getId(),
            forum.getUserId(),
            forum.getMessage(),
            forum.getCreatedAt()
        );
    }

    public Forum toEntity(ForumDTO dto) {
        if (dto == null) return null;
        Forum forum = new Forum();
        forum.setId(dto.getId());
        forum.setUserId(dto.getUserId());
        forum.setMessage(dto.getMessage());
        forum.setCreatedAt(dto.getCreatedAt());
        return forum;
    }
}