package com.app.dao;

import com.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewUser(User user) {
        jdbcTemplate.update("INSERT INTO users (name, surname, phone_number, email, password) " +
                        "VALUES (?, ?, ?, ?, ?)", user.getName(), user.getSurname(), user.getPhone_number(),
                user.getEmail(), user.getPassword());
    }

    public List<User> getAllUsers() {
        RowMapper<User> rowMapper = (rs, rowNumber) -> mapUser(rs);

        return jdbcTemplate.query("SELECT * FROM users", rowMapper);
    }

    private User mapUser(ResultSet rs) throws SQLException {
        User user = new User();

        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setSurname(rs.getString("surname"));
        user.setPhone_number(rs.getString("phone_number"));
        user.setEmail(rs.getString("email"));

        return user;
    }

}
