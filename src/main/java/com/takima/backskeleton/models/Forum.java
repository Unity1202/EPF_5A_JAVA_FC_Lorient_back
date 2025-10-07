package com.takima.backskeleton.models;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "forum")
public class Forum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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