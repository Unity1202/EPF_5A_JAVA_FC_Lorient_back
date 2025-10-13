package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.TeamDAO;
import com.takima.backskeleton.models.Team;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private final TeamDAO teamDAO;

    public TeamService(TeamDAO teamDAO) {
        this.teamDAO = teamDAO;
    }

    public List<Team> getAllTeams() {
        return teamDAO.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamDAO.findById(id);
    }

    public Team createTeam(Team team) {
        return teamDAO.save(team);
    }

    public Team updateTeam(Long id, Team teamDetails) {
        return teamDAO.findById(id).map(team -> {
            team.setName(teamDetails.getName());
            team.setShortName(teamDetails.getShortName());
            team.setCrest(teamDetails.getCrest());
            team.setRank(teamDetails.getRank());
            team.setPoints(teamDetails.getPoints());
            team.setPlayed(teamDetails.getPlayed());
            team.setWon(teamDetails.getWon());
            team.setDrawn(teamDetails.getDrawn());
            team.setLost(teamDetails.getLost());
            team.setDiff(teamDetails.getDiff());
            return teamDAO.save(team);
        }).orElse(null);
    }

    public void deleteTeam(Long id) {
        teamDAO.deleteById(id);
    }
}
