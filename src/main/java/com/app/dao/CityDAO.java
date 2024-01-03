package com.app.dao;

import com.app.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CityDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewCity(City city) {
        jdbcTemplate.update("INSERT INTO cities (city) VALUES (?)", city.getCityName());
    }
}
