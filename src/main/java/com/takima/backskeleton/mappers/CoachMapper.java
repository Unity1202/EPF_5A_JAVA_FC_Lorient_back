package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.CoachDTO;
import com.takima.backskeleton.models.Coach;
import org.springframework.stereotype.Component;

@Component
public class CoachMapper {
    public CoachDTO toDto(Coach coach) {
        if (coach == null) return null;
        return new CoachDTO(
            coach.getId(),
            coach.getFirstName(),
            coach.getLastName(),
            coach.getDateOfBirth(),
            coach.getNationality(),
            coach.getCrest()
        );
    }

    public Coach toEntity(CoachDTO dto) {
        if (dto == null) return null;
        Coach coach = new Coach();
        coach.setId(dto.getId());
        coach.setFirstName(dto.getFirstName());
        coach.setLastName(dto.getLastName());
        coach.setDateOfBirth(dto.getDateOfBirth());
        coach.setNationality(dto.getNationality());
        coach.setCrest(dto.getCrest());
        return coach;
    }
}
