package com.takima.backskeleton.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takima.backskeleton.DTO.CoachDTO;
import com.takima.backskeleton.mappers.CoachMapper;
import com.takima.backskeleton.models.Coach;
import com.takima.backskeleton.services.CoachService;

@RestController
@RequestMapping("/coachs")
@CrossOrigin(origins = "http://localhost:4200")
public class CoachController {

    private final CoachService coachService;
    private final CoachMapper coachMapper;

    public CoachController(CoachService coachService, CoachMapper coachMapper) {
        this.coachService = coachService;
        this.coachMapper = coachMapper;
    }

    @GetMapping
    public List<CoachDTO> getAllCoachs() {
        return coachService.getAllCoachs()
                .stream()
                .map(coachMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CoachDTO getCoachById(@PathVariable Long id) {
        return coachService.getCoachById(id)
                .map(coachMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public CoachDTO createCoach(@RequestBody CoachDTO coachDTO) {
        Coach coach = coachMapper.toEntity(coachDTO);
        return coachMapper.toDto(coachService.createCoach(coach));
    }

    @PutMapping("/{id}")
    public CoachDTO updateCoach(@PathVariable Long id, @RequestBody CoachDTO coachDTO) {
        Coach updated = coachMapper.toEntity(coachDTO);
        return coachMapper.toDto(coachService.updateCoach(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteCoach(@PathVariable Long id) {
        coachService.deleteCoach(id);
    }
}
