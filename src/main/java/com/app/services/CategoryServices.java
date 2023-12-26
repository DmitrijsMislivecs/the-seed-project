package com.app.services;

import com.app.dao.CategoryDAO;
import com.app.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServices {
    @Autowired
    private CategoryDAO categoryDAO;

    public void StoreNewCategory(Category category) {
        categoryDAO.storeNewCategory(category);
    }
}
