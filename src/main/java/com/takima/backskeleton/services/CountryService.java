package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.CountryDAO;
import com.takima.backskeleton.models.Country;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryDAO countryDAO;

    public CountryService(CountryDAO countryDAO) {
        this.countryDAO = countryDAO;
    }

    public List<Country> getAllCountries() {
        return countryDAO.findAll();
    }

    public Optional<Country> getCountryById(Long id) {
        return countryDAO.findById(id);
    }

    public Country createCountry(Country country) {
        return countryDAO.save(country);
    }

    public Country updateCountry(Long id, Country countryDetails) {
        return countryDAO.findById(id).map(country -> {
            country.setName(countryDetails.getName());
            country.setFlag(countryDetails.getFlag());
            return countryDAO.save(country);
        }).orElse(null);
    }

    public void deleteCountry(Long id) {
        countryDAO.deleteById(id);
    }
}
