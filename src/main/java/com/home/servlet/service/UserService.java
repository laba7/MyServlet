package com.home.servlet.service;

import com.home.servlet.model.User;

/**
 * Created by User on 29.08.2016.
 */
public interface UserService {
    boolean registerUser(User user);

    boolean isPasswordCorrect(String login, String pass);
}
