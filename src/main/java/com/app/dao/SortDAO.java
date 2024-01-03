package com.app.dao;

import com.app.model.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SortDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewSort(Sort sort) {
        jdbcTemplate.update("INSERT INTO sort (name) VALUES (?)", sort.getName());
    }
}
