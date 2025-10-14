package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Admin;
import com.takima.backskeleton.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends JpaRepository<Admin, Long> {
    Admin findByEmail(String email);
}
