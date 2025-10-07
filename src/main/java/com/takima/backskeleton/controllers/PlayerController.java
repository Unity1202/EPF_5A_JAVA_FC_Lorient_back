package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.PlayerDTO;
import com.takima.backskeleton.mappers.PlayerMapper;
import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.services.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/players")
public class PlayerController {

    private final PlayerService playerService;
    private final PlayerMapper playerMapper;

    public PlayerController(PlayerService playerService, PlayerMapper playerMapper) {
        this.playerService = playerService;
        this.playerMapper = playerMapper;
    }

    @GetMapping
    public List<PlayerDTO> getAllPlayers() {
        return playerService.getAllPlayers()
                .stream()
                .map(playerMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PlayerDTO getPlayerById(@PathVariable Long id) {
        return playerService.getPlayerById(id)
                .map(playerMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public PlayerDTO createPlayer(@RequestBody PlayerDTO playerDTO) {
        Player player = playerMapper.toEntity(playerDTO);
        return playerMapper.toDto(playerService.createPlayer(player));
    }

    @PutMapping("/{id}")
    public PlayerDTO updatePlayer(@PathVariable Long id, @RequestBody PlayerDTO playerDTO) {
        Player updated = playerMapper.toEntity(playerDTO);
        return playerMapper.toDto(playerService.updatePlayer(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
    }
}