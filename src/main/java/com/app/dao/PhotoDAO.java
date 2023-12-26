package com.app.dao;

import com.app.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PhotoDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void StoreNewPhoto(Photo photo) {
        jdbcTemplate.update("INSERT INTO photos (ad_id, url) VALUES (?,?)", photo.getAdvertisementId(), photo.getPhotoUrl());
    }
}
