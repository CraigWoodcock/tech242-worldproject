package com.sparta.mg.worldproject.repositories;

import com.sparta.mg.worldproject.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}