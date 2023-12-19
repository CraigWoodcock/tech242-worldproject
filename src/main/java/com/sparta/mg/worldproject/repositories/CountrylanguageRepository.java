package com.sparta.mg.worldproject.repositories;

import com.sparta.mg.worldproject.entities.Country;
import com.sparta.mg.worldproject.entities.Countrylanguage;
import com.sparta.mg.worldproject.entities.CountrylanguageId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountrylanguageRepository extends JpaRepository<Countrylanguage, CountrylanguageId> {
    List<Countrylanguage> findAllByCountryCode(Country country);
}