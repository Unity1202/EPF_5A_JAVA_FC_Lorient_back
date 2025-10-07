package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.PlayerDAO;
import com.takima.backskeleton.models.Player;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerDAO playerDAO;

    public PlayerService(PlayerDAO playerDAO) {
        this.playerDAO = playerDAO;
    }

    public List<Player> getAllPlayers() {
        return playerDAO.findAll();
    }

    public Optional<Player> getPlayerById(Long id) {
        return playerDAO.findById(id);
    }

    public Player createPlayer(Player player) {
        return playerDAO.save(player);
    }

    public Player updatePlayer(Long id, Player playerDetails) {
        return playerDAO.findById(id).map(player -> {
            player.setFirstName(playerDetails.getFirstName());
            player.setLastName(playerDetails.getLastName());
            player.setPosition(playerDetails.getPosition());
            player.setBirthDate(playerDetails.getBirthDate());
            player.setshirtNumber(playerDetails.getshirtNumber());
            player.setNationality(playerDetails.getNationality());
            player.setCrest(playerDetails.getCrest());
            return playerDAO.save(player);
        }).orElse(null);
    }

    public void deletePlayer(Long id) {
        playerDAO.deleteById(id);
    }
}
