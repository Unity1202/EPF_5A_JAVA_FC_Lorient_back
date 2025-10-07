package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.CoachDAO;
import com.takima.backskeleton.models.Coach;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoachService {
    private final CoachDAO coachDAO;

    public CoachService(CoachDAO coachDAO) {
        this.coachDAO = coachDAO;
    }

    public List<Coach> getAllCoachs() {
        return coachDAO.findAll();
    }

    public Optional<Coach> getCoachById(Long id) {
        return coachDAO.findById(id);
    }

    public Coach createCoach(Coach coach) {
        return coachDAO.save(coach);
    }

    public Coach updateCoach(Long id, Coach coachDetails) {
        return coachDAO.findById(id).map(coach -> {
            coach.setFirstName(coachDetails.getFirstName());
            coach.setLastName(coachDetails.getLastName());
            coach.setDateOfBirth(coachDetails.getDateOfBirth());
            coach.setNationality(coachDetails.getNationality());
            coach.setCrest(coachDetails.getCrest());
            return coachDAO.save(coach);
        }).orElse(null);
    }

    public void deleteCoach(Long id) {
        coachDAO.deleteById(id);
    }
}
