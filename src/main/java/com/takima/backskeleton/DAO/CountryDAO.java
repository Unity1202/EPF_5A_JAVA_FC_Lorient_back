package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryDAO extends JpaRepository<Country, Long> {
}