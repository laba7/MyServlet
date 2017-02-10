package com.home.servlet.dao.impl;

import com.home.servlet.dao.HibernateUtil;
import com.home.servlet.dao.UserDAO;
import com.home.servlet.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 * Created by User on 29.08.2016.
 */
public enum UserDAOImpl implements UserDAO {
    INSTANCE;


    public void save(User user) {
        Session session = HibernateUtil.getSession();

        session.save(user);
        session.close();
    }


    public User getUserByEmail(String email) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(User.class, "user").add(Restrictions.eq("email", email));
        User user = (User)criteria.uniqueResult();
        session.close();
        return user;
    }

    @Override
    public User getUserById(Long id) {
        Session session = HibernateUtil.getSession();

        Criteria criteria = session.createCriteria(User.class, "user").add(Restrictions.eq("id", id));
        User user = (User)criteria.uniqueResult();
        session.close();
        return user;
    }

    @Override
    public void update(User user) {
    Session session=HibernateUtil.getSession();

        session.update(user);
        session.close();
    }

    @Override
    public void delete(User user) {
    Session session=HibernateUtil.getSession();

    session.delete(user);
    session.close();
    }

    @Override
    public boolean isPasswordCorrect(String login, String pass) {
        User user =getUserByEmail(login);
        return user!=null && user.getPassword().equals(pass);
    }
}
