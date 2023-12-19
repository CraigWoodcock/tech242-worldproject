package com.sparta.mg.worldproject;

import com.sparta.mg.worldproject.entities.Countrylanguage;
import com.sparta.mg.worldproject.repositories.CountryRepository;
import com.sparta.mg.worldproject.repositories.CountrylanguageRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CountryLaguageTests {

    @Autowired
    private CountrylanguageRepository countrylanguageRepository;
    @Autowired
    private CountryRepository countryRepository;

    @Test
    @DisplayName("Check that we can pull data from the repository")
    void checkThatWeCanPullDataFromTheRepository() {

        List<Countrylanguage> allByCountryCode = countrylanguageRepository.findAllByCountryCode(countryRepository.findById("ABW").get());

        allByCountryCode.forEach(countrylanguage -> {
            System.out.println(countrylanguage.getId().getLanguage());
            System.out.println(countrylanguage.getPercentage());
        });
    }
}
