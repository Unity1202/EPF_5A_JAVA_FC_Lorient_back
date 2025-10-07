package com.takima.backskeleton.DTO;

import java.sql.Timestamp;

public class ArticleDTO {
    private long id;
    private String title;
    private String content;
    private String image;
    private Timestamp createdAt;

    public ArticleDTO() {}

    public ArticleDTO(long id, String title, String content, String image, Timestamp createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.image = image;
        this.createdAt = createdAt;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public Timestamp getCreatedAt() { return createdAt; }
    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
}
