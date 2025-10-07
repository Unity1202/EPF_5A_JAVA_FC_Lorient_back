package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Forum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForumDAO extends JpaRepository<Forum, Long> {
}