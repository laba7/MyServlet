package com.home.servlet.model;

import javax.persistence.*;

/**
 * Created by User on 03.09.2016.
 */

@Entity
@Table(name = "CAR_BRAND")
public class CarBrand {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID_BRAND")
  private Long   idBrand;
  @Column(name = "CAR_BRAND")
  private String carBrand;

  public CarBrand() {
  }

  public CarBrand(String carBrand) {
    this.carBrand = carBrand;
  }

  public Long getIdBrand() {
    return idBrand;
  }

  public void setIdBrand(Long idBrand) {
    this.idBrand = idBrand;
  }

  public String getCarBrand() {
    return carBrand;
  }

  public void setCarBrand(String carBrand) {
    this.carBrand = carBrand;
  }
}

