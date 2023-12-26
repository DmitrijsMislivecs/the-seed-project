package com.app.services;

import com.app.dao.SortDAO;
import com.app.model.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SortServices {
    @Autowired
    private SortDAO sortDAO;

    public void StoreNewSort(Sort sort) {
        sortDAO.StoreNewSort(sort);
    }
}
