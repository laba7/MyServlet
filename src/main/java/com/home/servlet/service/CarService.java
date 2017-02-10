package com.home.servlet.service;

import com.home.servlet.model.CarBrand;
import com.home.servlet.model.User;

import java.util.List;

/**
 * Created by User on 29.08.2016.
 */
public interface CarService {

    List getAllCarBrand();

    List getModel(Long idBrand);
}
