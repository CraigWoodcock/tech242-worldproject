package com.sparta.mg.worldproject.controller;

import com.sparta.mg.worldproject.entities.City;
import com.sparta.mg.worldproject.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CityController {

    private final CityRepository cityRepository;

    @Autowired
    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @GetMapping("/city")
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @GetMapping("/city/{id}")
    public Optional<City> getCity(@PathVariable Integer id) {
        return cityRepository.findById(id);
    }
}
