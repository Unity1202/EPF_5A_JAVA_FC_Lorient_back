package com.takima.backskeleton.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takima.backskeleton.models.Forum;

@Repository
public interface ForumDAO extends JpaRepository<Forum, Long> {

    List<Forum> findAllByOrderByCreatedAtDesc();
}
