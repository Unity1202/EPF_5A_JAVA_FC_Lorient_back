package com.takima.backskeleton.DTO;

import java.sql.Timestamp;

public class ForumDTO {

    private long id;
    private int userId;
    private String firstName;
    private String message;
    private Timestamp createdAt;

    public ForumDTO() {
    }

    public ForumDTO(long id, int userId, String firstName, String message, Timestamp createdAt) {
        this.id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.message = message;
        this.createdAt = createdAt;
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
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
    }
}
