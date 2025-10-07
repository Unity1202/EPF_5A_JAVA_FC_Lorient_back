package com.takima.backskeleton.controllers;

import com.takima.backskeleton.DTO.CountryDTO;
import com.takima.backskeleton.mappers.CountryMapper;
import com.takima.backskeleton.models.Country;
import com.takima.backskeleton.services.CountryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryService countryService;
    private final CountryMapper countryMapper;

    public CountryController(CountryService countryService, CountryMapper countryMapper) {
        this.countryService = countryService;
        this.countryMapper = countryMapper;
    }

    @GetMapping
    public List<CountryDTO> getAllCountries() {
        return countryService.getAllCountries()
                .stream()
                .map(countryMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CountryDTO getCountryById(@PathVariable Long id) {
        return countryService.getCountryById(id)
                .map(countryMapper::toDto)
                .orElse(null);
    }

    @PostMapping
    public CountryDTO createCountry(@RequestBody CountryDTO countryDTO) {
        Country country = countryMapper.toEntity(countryDTO);
        return countryMapper.toDto(countryService.createCountry(country));
    }

    @PutMapping("/{id}")
    public CountryDTO updateCountry(@PathVariable Long id, @RequestBody CountryDTO countryDTO) {
        Country updated = countryMapper.toEntity(countryDTO);
        return countryMapper.toDto(countryService.updateCountry(id, updated));
    }

    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable Long id) {
        countryService.deleteCountry(id);
    }
}
