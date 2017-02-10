package com.home.servlet.view;

import com.home.servlet.dao.CarDAO;
import com.home.servlet.dao.impl.CarDAOImpl;
import com.home.servlet.model.CarBrand;
import com.home.servlet.service.CarService;
import com.home.servlet.service.impl.CarServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by User on 29.08.2016.
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

    private CarService carService = CarServiceImpl.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List list = carService.getAllCarBrand();

        req.setAttribute("listBrand", list);
//        req.getRequestDispatcher("layout/jsp/main/registration.jsp").forward(req, resp);

        Long idBrand = 1l;
        if(req.getParameter("idBrand") != null){
            idBrand = Long.parseLong(req.getParameter("idBrand"));
        }


//        carService.getModel(carBrand);
        List model = carService.getModel(idBrand);
        req.setAttribute("model", model);
        req.getRequestDispatcher("layout/jsp/main/registration.jsp").forward(req, resp);
    }
}
