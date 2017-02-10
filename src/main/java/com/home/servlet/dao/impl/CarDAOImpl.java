package com.home.servlet.dao.impl;

import com.home.servlet.dao.CarDAO;
import com.home.servlet.dao.HibernateUtil;
import com.home.servlet.model.CarBrand;
import com.home.servlet.model.Model;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public enum CarDAOImpl implements CarDAO {

  INSTANCE;

  @Override
  public List getModel(Long idBrand) {

    Session session = HibernateUtil.getSession();
//      CarBrand car = (CarBrand) session.get(CarBrand.class,carBrand);
//      Query query = session.createQuery("from CAR_BRAND where CAR_BRAND = :carBrand ").setLong("idBrand", id_brand);
//      String query = "SELECT id_brand FROM CAR_BRAND WHERE car_brand="+carBrand;
//      SQLQuery idBrand = session.createSQLQuery(query);

    List model = session.createCriteria(Model.class, "model").add(Restrictions.eq("idBrand", idBrand )).list();
      session.close();
    return model;
  }
  @Override
  public List getAllCarBrand() {
    Session session = HibernateUtil.getSession();
    
    List list = session.createCriteria(CarBrand.class).list();
    session.close();
    return list;
  }
}
