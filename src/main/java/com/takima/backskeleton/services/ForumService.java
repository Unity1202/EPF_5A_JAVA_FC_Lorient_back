package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.ForumDAO;
import com.takima.backskeleton.models.Forum;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ForumService {
    private final ForumDAO forumDAO;

    public ForumService(ForumDAO forumDAO) {
        this.forumDAO = forumDAO;
    }

    public List<Forum> getAllForums() {
        return forumDAO.findAll();
    }

    public Optional<Forum> getForumById(Long id) {
        return forumDAO.findById(id);
    }

    public Forum createForum(Forum forum) {
        return forumDAO.save(forum);
    }

    public Forum updateForum(Long id, Forum forumDetails) {
        return forumDAO.findById(id).map(forum -> {
            forum.setUserId(forumDetails.getUserId());
            forum.setMessage(forumDetails.getMessage());
            forum.setCreatedAt(forumDetails.getCreatedAt());
            return forumDAO.save(forum);
        }).orElse(null);
    }

    public void deleteForum(Long id) {
        forumDAO.deleteById(id);
    }
}