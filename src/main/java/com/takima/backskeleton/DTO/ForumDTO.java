package com.takima.backskeleton.DTO;

import java.sql.Timestamp;

public class ForumDTO {
    private long id;
    private int userId;
    private String message;
    private Timestamp createdAt;

    public ForumDTO() {}

    public ForumDTO(long id, int userId, String message, Timestamp createdAt) {
        this.id = id;
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