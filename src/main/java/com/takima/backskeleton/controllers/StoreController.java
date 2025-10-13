package com.takima.backskeleton.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takima.backskeleton.DTO.StoreDTO;
import com.takima.backskeleton.mappers.StoreMapper;
import com.takima.backskeleton.models.Store;
import com.takima.backskeleton.services.StoreService;

@RestController
@RequestMapping("/stores")
@CrossOrigin(origins = "http://localhost:4200")
public class StoreController {

    private final StoreService storeService;
    private final StoreMapper storeMapper;

    public StoreController(StoreService storeService, StoreMapper storeMapper) {
        this.storeService = storeService;
        this.storeMapper = storeMapper;
    }

    @GetMapping
    public List<StoreDTO> getAllStores() {
        return storeService.getAllStores()
                .stream()
                .map(storeMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public StoreDTO getStoreById(@PathVariable Long id) {
        return storeService.getStoreById(id)
                .map(storeMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public StoreDTO createStore(@RequestBody StoreDTO storeDTO) {
        Store store = storeMapper.toEntity(storeDTO);
        return storeMapper.toDto(storeService.createStore(store));
    }

    @PutMapping("/{id}")
    public StoreDTO updateStore(@PathVariable Long id, @RequestBody StoreDTO storeDTO) {
        Store updated = storeMapper.toEntity(storeDTO);
        return storeMapper.toDto(storeService.updateStore(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteStore(@PathVariable Long id) {
        storeService.deleteStore(id);
    }
}