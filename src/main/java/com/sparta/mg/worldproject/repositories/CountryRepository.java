package com.sparta.mg.worldproject.repositories;

import com.sparta.mg.worldproject.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    @Query("SELECT c FROM Country c WHERE c.code = :code")
    Optional<Country> findByCountryCodeCode(@Param("code") String code);
}