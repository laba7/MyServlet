package com.home.servlet.view;

import com.home.servlet.dao.HibernateUtil;
import com.home.servlet.model.CarBrand;
import org.hibernate.classic.Session;
import org.hibernate.transform.Transformers;

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
@WebServlet("/main")
public class MainServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("layout/jsp/main/welcome.jsp").forward(req, resp);
    }
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       HibernateUtil.getSession();
        String section = req.getParameter("section");

        List<CarBrand> carBrand = (List<CarBrand>)session.createSQLQuery("select CAR_BRAND from CAR_BRAND")
                .addScalar("CAR_BRAND")
                .setResultTransformer(Transformers.aliasToBean(CarBrand.class)).list();


                */
    }
    /*
      private UserService userService = UserServiceImpl.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("layout/jsp/main/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User user = new User(null, firstName, lastName, email, password);
        if (userService.registerUser(user)) {
            req.setAttribute("error_message", String.format("User with such email %s is already exist", user.getEmail()));
            req.getRequestDispatcher("layout/jsp/main/error.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("layout/jsp/main/welcome.jsp").forward(req, resp);
        }
    }
     */

