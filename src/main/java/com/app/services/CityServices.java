package com.app.services;

import com.app.dao.CityDAO;
import com.app.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServices {
    @Autowired
    private CityDAO cityDAO;

    public void StoreNewCity(City city) {
        cityDAO.StoreNewCity(city);
    }
}
