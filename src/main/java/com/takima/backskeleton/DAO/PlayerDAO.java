package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerDAO extends JpaRepository<Player, Long> {
}