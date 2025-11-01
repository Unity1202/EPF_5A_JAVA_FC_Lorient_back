package com.takima.backskeleton.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.takima.backskeleton.models.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

    User findByEmail(String email);

    // Méthode alternative insensible à la casse (peut nécessiter une requête personnalisée)
    User findByEmailIgnoreCase(String email);
}
