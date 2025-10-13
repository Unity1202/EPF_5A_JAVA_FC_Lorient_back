package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.TeamDTO;
import com.takima.backskeleton.mappers.TeamMapper;
import com.takima.backskeleton.models.Team;
import com.takima.backskeleton.services.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamService;
    private final TeamMapper teamMapper;

    public TeamController(TeamService teamService, TeamMapper teamMapper) {
        this.teamService = teamService;
        this.teamMapper = teamMapper;
    }

    @GetMapping
    public List<TeamDTO> getAllTeams() {
        return teamService.getAllTeams()
                .stream()
                .map(teamMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public TeamDTO getTeamById(@PathVariable Long id) {
        return teamService.getTeamById(id)
                .map(teamMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public TeamDTO createTeam(@RequestBody TeamDTO teamDTO) {
        Team team = teamMapper.toEntity(teamDTO);
        return teamMapper.toDto(teamService.createTeam(team));
    }

    @PutMapping("/{id}")
    public TeamDTO updateTeam(@PathVariable Long id, @RequestBody TeamDTO teamDTO) {
        Team updated = teamMapper.toEntity(teamDTO);
        return teamMapper.toDto(teamService.updateTeam(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        teamService.deleteTeam(id);
    }
}
