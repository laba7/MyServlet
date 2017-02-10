package com.home.servlet.service.impl;


import com.home.servlet.dao.UserDAO;
import com.home.servlet.dao.impl.UserDAOImpl;
import com.home.servlet.model.User;
import com.home.servlet.service.UserService;

/**
 * Created by Alexandr Shegeda on 16.08.16.
 */
public enum UserServiceImpl implements UserService {

    INSTANCE;

    private UserDAO userDAO = UserDAOImpl.INSTANCE;

    public boolean registerUser(User user) {
        if (userDAO.getUserByEmail(user.getEmail()) == null) {
            userDAO.save(user);
            System.out.println(String.format("User with email %s created", user.getEmail()));
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean isPasswordCorrect(String login, String pass) {
        return userDAO.isPasswordCorrect(login, pass);
    }


}
