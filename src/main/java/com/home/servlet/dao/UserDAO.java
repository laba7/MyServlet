package com.home.servlet.dao;

import com.home.servlet.model.User;

/**
 * Created by User on 29.08.2016.
 */
public interface UserDAO {

    void save(User user);

    User getUserByEmail(String email);

    User getUserById(Long id);

    void update(User user);

    void delete(User user);

    boolean isPasswordCorrect(String login, String pass);
}
