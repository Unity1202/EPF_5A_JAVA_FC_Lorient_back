package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.ForumDTO;
import com.takima.backskeleton.mappers.ForumMapper;
import com.takima.backskeleton.models.Forum;
import com.takima.backskeleton.services.ForumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/forums")
public class ForumController {

    private final ForumService forumService;
    private final ForumMapper forumMapper;

    public ForumController(ForumService forumService, ForumMapper forumMapper) {
        this.forumService = forumService;
        this.forumMapper = forumMapper;
    }

    @GetMapping
    public List<ForumDTO> getAllForums() {
        return forumService.getAllForums()
                .stream()
                .map(forumMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ForumDTO getForumById(@PathVariable Long id) {
        return forumService.getForumById(id)
                .map(forumMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public ForumDTO createForum(@RequestBody ForumDTO forumDTO) {
        Forum forum = forumMapper.toEntity(forumDTO);
        return forumMapper.toDto(forumService.createForum(forum));
    }

    @PutMapping("/{id}")
    public ForumDTO updateForum(@PathVariable Long id, @RequestBody ForumDTO forumDTO) {
        Forum updated = forumMapper.toEntity(forumDTO);
        return forumMapper.toDto(forumService.updateForum(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteForum(@PathVariable Long id) {
        forumService.deleteForum(id);
    }
}