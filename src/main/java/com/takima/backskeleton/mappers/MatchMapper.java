package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.MatchDTO;
import com.takima.backskeleton.models.Match;
import org.springframework.stereotype.Component;

@Component
public class MatchMapper {
    public MatchDTO toDto(Match match) {
        if (match == null) return null;
        return new MatchDTO(
            match.getId(),
            match.getUtcDate(),
            match.getStatus(),
            match.getScore_home(),
            match.getScore_away(),
            match.getHomeTeamId(),
            match.getAwayTeamId()
        );
    }

    public Match toEntity(MatchDTO dto) {
        if (dto == null) return null;
        Match match = new Match();
        match.setId(dto.getId());
        match.setUtcDate(dto.getUtcDate());
        match.setStatus(dto.getStatus());
        match.setScore_home(dto.getScore_home());
        match.setScore_away(dto.getScore_away());
        match.setHomeTeamId(dto.getHomeTeamId());
        match.setAwayTeamId(dto.getAwayTeamId());
        return match;
    }
}
