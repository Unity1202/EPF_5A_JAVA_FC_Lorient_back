package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.ArticleDTO;
import com.takima.backskeleton.models.Article;
import org.springframework.stereotype.Component;

@Component
public class ArticleMapper {
    public ArticleDTO toDto(Article article) {
        if (article == null) return null;
        return new ArticleDTO(
            article.getId(),
            article.getTitle(),
            article.getContent(),
            article.getImage(),
            article.getCreatedAt()
        );
    }

    public Article toEntity(ArticleDTO dto) {
        if (dto == null) return null;
        Article article = new Article();
        article.setId(dto.getId());
        article.setTitle(dto.getTitle());
        article.setContent(dto.getContent());
        article.setImage(dto.getImage());
        article.setCreatedAt(dto.getCreatedAt());
        return article;
    }
}
