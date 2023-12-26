package com.app.services;

import com.app.dao.UserDAO;
import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    private UserDAO userDAO;

    public void storeNewUser(User user) {
        userDAO.storeNewUser(user);
    }
}
