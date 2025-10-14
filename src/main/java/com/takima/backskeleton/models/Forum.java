package com.takima.backskeleton.models;

<<<<<<< HEAD
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "forum")
public class Forum {
=======
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name = "forum")
public class Forum {

>>>>>>> devStef
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

<<<<<<< HEAD
    private int userId;
    private String message;
    private Timestamp createdAt;

    public Forum() {}

    public Forum(int userId, String message, Timestamp createdAt) {
        this.userId = userId;
        this.message = message;
        this.createdAt = createdAt;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
=======
    @Column(name = "user_id")
    private int userId;

    // Legacy/alternate column kept in DB and marked NOT NULL
    @Column(name = "userid")
    private Integer userIdLegacy;

    @Column(name = "message")
    private String message;

    @Column(name = "created_at")
    private Timestamp createdAt;

    // Legacy/alternate column kept in DB
    @Column(name = "createdat")
    private Timestamp createdAtLegacy;

    public Forum() {
    }

    public Forum(int userId, String message, Timestamp createdAt) {
        this.userId = userId;
        this.userIdLegacy = userId;
        this.message = message;
        this.createdAt = createdAt;
        this.createdAtLegacy = createdAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
        this.userIdLegacy = userId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
        this.createdAtLegacy = createdAt;
    }

    @PrePersist
    public void prePersist() {
        if (this.userIdLegacy == null) {
            this.userIdLegacy = this.userId;
        }
        if (this.createdAtLegacy == null) {
            this.createdAtLegacy = this.createdAt;
        }
    }

    @PreUpdate
    public void preUpdate() {
        if (this.userIdLegacy == null) {
            this.userIdLegacy = this.userId;
        }
        if (this.createdAtLegacy == null) {
            this.createdAtLegacy = this.createdAt;
        }
    }
}
>>>>>>> devStef
