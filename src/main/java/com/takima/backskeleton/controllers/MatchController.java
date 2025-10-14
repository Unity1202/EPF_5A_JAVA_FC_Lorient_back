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

import com.takima.backskeleton.DTO.MatchDTO;
import com.takima.backskeleton.mappers.MatchMapper;
import com.takima.backskeleton.models.Match;
import com.takima.backskeleton.services.MatchService;

@RestController
@RequestMapping("/matchs")
@CrossOrigin(origins = "http://localhost:4200")

public class MatchController {

    private final MatchService matchService;
    private final MatchMapper matchMapper;

    public MatchController(MatchService matchService, MatchMapper matchMapper) {
        this.matchService = matchService;
        this.matchMapper = matchMapper;
    }

    @GetMapping
    public List<MatchDTO> getAllMatches() {
        return matchService.getAllMatches()
                .stream()
                .map(matchMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public MatchDTO getMatchById(@PathVariable Long id) {
        return matchService.getMatchById(id)
                .map(matchMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public MatchDTO createMatch(@RequestBody MatchDTO matchDTO) {
        Match match = matchMapper.toEntity(matchDTO);
        return matchMapper.toDto(matchService.createMatch(match));
    }

    @PutMapping("/{id}")
    public MatchDTO updateMatch(@PathVariable Long id, @RequestBody MatchDTO matchDTO) {
        Match updated = matchMapper.toEntity(matchDTO);
        return matchMapper.toDto(matchService.updateMatch(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable Long id) {
        matchService.deleteMatch(id);
    }
}
