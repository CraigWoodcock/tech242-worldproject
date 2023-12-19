package com.sparta.mg.worldproject;

import com.sparta.mg.worldproject.controller.CityController;
import com.sparta.mg.worldproject.entities.City;
import com.sparta.mg.worldproject.repositories.CityRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

@WebMvcTest(CityController.class)
class CityControllerTests {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private CityRepository cityRepository;

    @Test
    @DisplayName("test rest output")
    void testRestOutput() throws Exception {
        City city = new City();
        city.setName("Undercity");
        Mockito.when(cityRepository.findAll()).thenReturn(new ArrayList<>(Arrays.asList(city)));
        mockMvc.perform(get("http://localhost:5000/city")).andDo(print());
    }
}
