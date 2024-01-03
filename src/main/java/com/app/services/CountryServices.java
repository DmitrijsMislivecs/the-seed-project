package com.app.services;

import com.app.dao.CountryDAO;
import com.app.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServices {
    @Autowired
    private CountryDAO countryDAO;

    public void storeNewCountry(Country country) {
        countryDAO.storeNewCountry(country);
    }
}
