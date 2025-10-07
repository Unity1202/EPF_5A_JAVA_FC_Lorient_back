package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.StoreDTO;
import com.takima.backskeleton.mappers.StoreMapper;
import com.takima.backskeleton.models.Store;
import com.takima.backskeleton.services.StoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/stores")
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