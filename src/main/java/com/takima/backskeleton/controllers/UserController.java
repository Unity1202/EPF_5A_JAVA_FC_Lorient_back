package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.UserDTO;
import com.takima.backskeleton.mappers.UserMapper;
import com.takima.backskeleton.models.User;
import com.takima.backskeleton.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers()
                .stream()
                .map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        return userService.getUserById(id)
                .map(userMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        User user = userMapper.toEntity(userDTO);
        return userMapper.toDto(userService.createUser(user));
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        User updated = userMapper.toEntity(userDTO);
        return userMapper.toDto(userService.updateUser(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
