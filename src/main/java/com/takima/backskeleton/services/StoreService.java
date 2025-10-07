package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.StoreDAO;
import com.takima.backskeleton.models.Store;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoreService {
    private final StoreDAO storeDAO;

    public StoreService(StoreDAO storeDAO) {
        this.storeDAO = storeDAO;
    }

    public List<Store> getAllStores() {
        return storeDAO.findAll();
    }

    public Optional<Store> getStoreById(Long id) {
        return storeDAO.findById(id);
    }

    public Store createStore(Store store) {
        return storeDAO.save(store);
    }

    public Store updateStore(Long id, Store storeDetails) {
        return storeDAO.findById(id).map(store -> {
            store.setName(storeDetails.getName());
            store.setDescription(storeDetails.getDescription());
            store.setImage(storeDetails.getImage());
            store.setPrice(storeDetails.getPrice());
            return storeDAO.save(store);
        }).orElse(null);
    }

    public void deleteStore(Long id) {
        storeDAO.deleteById(id);
    }
}
