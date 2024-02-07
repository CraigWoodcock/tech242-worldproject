package com.sparta.mg.worldproject.controller;

import com.sparta.mg.worldproject.entities.Country;
import com.sparta.mg.worldproject.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryController(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @GetMapping("/country")
    public List<Country> getAllCountries(){ return countryRepository.findAll();}

//    @GetMapping("/country/{code}")
//    public Optional<Country> getCountry(@PathVariable String code){
//        return countryRepository.findByCode(code);}

    @GetMapping("/country/{code}")
    public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {
        Optional<Country> country = countryRepository.findByCountryCodeCode(code);
        if (country.isPresent()) {
            return ResponseEntity.ok(country.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
