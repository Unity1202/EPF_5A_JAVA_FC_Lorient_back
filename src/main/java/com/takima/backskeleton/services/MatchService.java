package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.MatchDAO;
import com.takima.backskeleton.models.Match;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    private final MatchDAO matchDAO;

    public MatchService(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    public List<Match> getAllMatches() {
        return matchDAO.findAll();
    }

    public Optional<Match> getMatchById(Long id) {
        return matchDAO.findById(id);
    }

    public Match createMatch(Match match) {
        return matchDAO.save(match);
    }

    public Match updateMatch(Long id, Match matchDetails) {
        return matchDAO.findById(id).map(match -> {
            match.setUtcDate(matchDetails.getUtcDate());
            match.setStatus(matchDetails.getStatus());
            match.setScore_home(matchDetails.getScore_home());
            match.setScore_away(matchDetails.getScore_away());
            match.setHomeTeamId(matchDetails.getHomeTeamId());
            match.setAwayTeamId(matchDetails.getAwayTeamId());
            return matchDAO.save(match);
        }).orElse(null);
    }

    public void deleteMatch(Long id) {
        matchDAO.deleteById(id);
    }
}