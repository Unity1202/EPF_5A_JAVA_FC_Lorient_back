package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.ArticleDTO;
import com.takima.backskeleton.mappers.ArticleMapper;
import com.takima.backskeleton.models.Article;
import com.takima.backskeleton.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private final ArticleService articleService;
    private final ArticleMapper articleMapper;

    public ArticleController(ArticleService articleService, ArticleMapper articleMapper) {
        this.articleService = articleService;
        this.articleMapper = articleMapper;
    }

    @GetMapping
    public List<ArticleDTO> getAllArticles() {
        return articleService.getAllArticles()
                .stream()
                .map(articleMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ArticleDTO getArticleById(@PathVariable Long id) {
        return articleService.getArticleById(id)
                .map(articleMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public ArticleDTO createArticle(@RequestBody ArticleDTO articleDTO) {
        Article article = articleMapper.toEntity(articleDTO);
        return articleMapper.toDto(articleService.createArticle(article));
    }

    @PutMapping("/{id}")
    public ArticleDTO updateArticle(@PathVariable Long id, @RequestBody ArticleDTO articleDTO) {
        Article updated = articleMapper.toEntity(articleDTO);
        return articleMapper.toDto(articleService.updateArticle(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Long id) {
        articleService.deleteArticle(id);
    }
}
