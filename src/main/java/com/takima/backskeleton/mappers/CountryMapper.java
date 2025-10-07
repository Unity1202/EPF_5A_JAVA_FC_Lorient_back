package com.takima.backskeleton.mappers;

import com.takima.backskeleton.DTO.CountryDTO;
import com.takima.backskeleton.models.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {
    public CountryDTO toDto(Country country) {
        if (country == null) return null;
        return new CountryDTO(
            country.getId(),
            country.getName(),
            country.getFlag()
        );
    }

    public Country toEntity(CountryDTO dto) {
        if (dto == null) return null;
        Country country = new Country();
        country.setId(dto.getId());
        country.setName(dto.getName());
        country.setFlag(dto.getFlag());
        return country;
    }
}
