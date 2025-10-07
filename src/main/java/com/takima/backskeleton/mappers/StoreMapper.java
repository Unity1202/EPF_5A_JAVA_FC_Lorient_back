package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.StoreDTO;
import com.takima.backskeleton.models.Store;
import org.springframework.stereotype.Component;

@Component
public class StoreMapper {
    public StoreDTO toDto(Store store) {
        if (store == null) return null;
        return new StoreDTO(
            store.getId(),
            store.getName(),
            store.getDescription(),
            store.getImage(),
            store.getPrice()
        );
    }

    public Store toEntity(StoreDTO dto) {
        if (dto == null) return null;
        Store store = new Store();
        store.setId(dto.getId());
        store.setName(dto.getName());
        store.setDescription(dto.getDescription());
        store.setImage(dto.getImage());
        store.setPrice(dto.getPrice());
        return store;
    }
}
