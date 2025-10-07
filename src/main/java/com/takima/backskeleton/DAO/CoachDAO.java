package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Coach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoachDAO extends JpaRepository<Coach, Long> {
}
