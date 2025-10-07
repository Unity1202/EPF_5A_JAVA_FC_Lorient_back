package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleDAO extends JpaRepository<Article, Long> {
}
