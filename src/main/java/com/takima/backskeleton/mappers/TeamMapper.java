package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.TeamDTO;
import com.takima.backskeleton.models.Team;
import org.springframework.stereotype.Component;

@Component
public class TeamMapper {
    public TeamDTO toDto(Team team) {
        if (team == null) return null;
        return new TeamDTO(
            team.getId(),
            team.getName(),
            team.getShortName(),
            team.getCrest(),
            team.getRank(),
            team.getPoints(),
            team.getPlayed(),
            team.getWon(),
            team.getDrawn(),
            team.getLost(),
            team.getDiff()
        );
    }

    public Team toEntity(TeamDTO dto) {
        if (dto == null) return null;
        Team team = new Team();
        team.setId(dto.getId());
        team.setName(dto.getName());
        team.setShortName(dto.getShortName());
        team.setCrest(dto.getCrest());
        team.setRank(dto.getRank());
        team.setPoints(dto.getPoints());
        team.setPlayed(dto.getPlayed());
        team.setWon(dto.getWon());
        team.setDrawn(dto.getDrawn());
        team.setLost(dto.getLost());
        team.setDiff(dto.getDiff());
        return team;
    }
}
