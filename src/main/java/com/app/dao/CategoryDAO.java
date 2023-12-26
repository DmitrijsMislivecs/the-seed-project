package com.app.dao;

import com.app.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewCategory(Category category) {
        jdbcTemplate.update("INSERT INTO categories (name, parent_category_id) " +
                "VALUES (?, ?)", category.getName(), category.getParent_categoryId());
    }
}
