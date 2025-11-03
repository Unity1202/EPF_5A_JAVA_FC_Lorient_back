package com.takima.backskeleton.services;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.takima.backskeleton.DAO.ArticleDAO;
import com.takima.backskeleton.models.Article;

@Service
public class ArticleService {

    private final ArticleDAO articleDAO;

    public ArticleService(ArticleDAO articleDAO) {
        this.articleDAO = articleDAO;
    }

    public List<Article> getAllArticles() {
        return articleDAO.findAll();
    }

    public Optional<Article> getArticleById(Long id) {
        return articleDAO.findById(id);
    }

    public Article createArticle(Article article) {
        if (article.getCreatedAt() == null) {
            article.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        }
        return articleDAO.save(article);
    }

    public Article updateArticle(Long id, Article articleDetails) {
        return articleDAO.findById(id).map(article -> {
            article.setTitle(articleDetails.getTitle());
            article.setContent(articleDetails.getContent());
            article.setImage(articleDetails.getImage());
            // Preserve original createdAt if not provided in update
            if (articleDetails.getCreatedAt() != null) {
                article.setCreatedAt(articleDetails.getCreatedAt());
            }
            return articleDAO.save(article);
        }).orElse(null);
    }

    public void deleteArticle(Long id) {
        articleDAO.deleteById(id);
    }
}
