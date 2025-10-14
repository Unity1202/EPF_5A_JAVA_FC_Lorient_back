package com.takima.backskeleton.services;

<<<<<<< HEAD
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
=======
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.takima.backskeleton.DAO.ForumDAO;
import com.takima.backskeleton.DAO.UserDAO;
import com.takima.backskeleton.models.Forum;

@Service
public class ForumService {

    private final ForumDAO forumDAO;
    private final UserDAO userDAO;

    public ForumService(ForumDAO forumDAO, UserDAO userDAO) {
        this.forumDAO = forumDAO;
        this.userDAO = userDAO;
>>>>>>> devStef
    }

    public List<Forum> getAllForums() {
        return forumDAO.findAll();
    }

    public Optional<Forum> getForumById(Long id) {
        return forumDAO.findById(id);
    }

    public Forum createForum(Forum forum) {
<<<<<<< HEAD
=======
        if (forum == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Payload manquant");
        }
        if (forum.getUserId() <= 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "userId invalide");
        }
        if (forum.getMessage() == null || forum.getMessage().trim().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "message requis");
        }
        if (!userDAO.existsById((long) forum.getUserId())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "userId inconnu");
        }
        if (forum.getCreatedAt() == null) {
            forum.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        }
>>>>>>> devStef
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
<<<<<<< HEAD
}
=======
}
>>>>>>> devStef
