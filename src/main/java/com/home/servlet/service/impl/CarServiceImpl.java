package com.home.servlet.service.impl;


import com.home.servlet.dao.CarDAO;
import com.home.servlet.dao.HibernateUtil;
import com.home.servlet.dao.UserDAO;
import com.home.servlet.dao.impl.CarDAOImpl;
import com.home.servlet.dao.impl.UserDAOImpl;
import com.home.servlet.model.CarBrand;
import com.home.servlet.model.User;
import com.home.servlet.service.CarService;
import com.home.servlet.service.UserService;
import org.hibernate.Hibernate;
import org.hibernate.classic.Session;
import org.hibernate.transform.Transformers;

import java.util.List;

/**
 * Created by Alexandr Shegeda on 16.08.16.
 */
public enum CarServiceImpl implements CarService {

    INSTANCE;

    private CarDAO carDAO = CarDAOImpl.INSTANCE;

    @Override
    public List getModel(Long idBrand) {
        return carDAO.getModel(idBrand);
    }

    @Override
    public List getAllCarBrand() {
        return carDAO.getAllCarBrand();
    }
}
