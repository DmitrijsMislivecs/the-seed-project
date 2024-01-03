package com.app.dao;

import com.app.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewCountry(Country country) {
        jdbcTemplate.update("INSERT INTO countries(country) VALUES (?)", country.getCountry());
    }
}
