package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.PlayerDTO;
import com.takima.backskeleton.models.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {
    public PlayerDTO toDto(Player player) {
        if (player == null) return null;
        return new PlayerDTO(
            player.getId(),
            player.getFirstName(),
            player.getLastName(),
            player.getPosition(),
            player.getBirthDate(),
            player.getshirtNumber(),
            player.getNationality(),
            player.getCrest()
        );
    }

    public Player toEntity(PlayerDTO dto) {
        if (dto == null) return null;
        Player player = new Player();
        player.setId(dto.getId());
        player.setFirstName(dto.getFirstName());
        player.setLastName(dto.getLastName());
        player.setPosition(dto.getPosition());
        player.setBirthDate(dto.getBirthDate());
        player.setshirtNumber(dto.getshirtNumber());
        player.setNationality(dto.getNationality());
        player.setCrest(dto.getCrest());
        return player;
    }
}