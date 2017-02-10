package com.home.servlet.model;

import javax.persistence.*;
import javax.persistence.Table;

/**
 * Created by User on 29.08.2016.
 */
@Entity
@Table(name = "ADS_CAR")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ADS")
    private Long id;
    @Column(name = "SECTION")
    private String section;
    @Column(name = "CAR_BRAND")
    private String car;
    @Column(name = "MODEL")
    private String model;
    @Column(name  = "YEAR")
    private long year;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "VOLUME")
    private  Long volume;
    @Column(name = "EQUIPMENT")
    private String equipment;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "MILEAGE")
    private Long milage;

    public Car() {
    }

    public Car(Long id, String section, String car, String model, long year,
               String type, Long volume, String equipment, Long price, Long milage) {
        this.id = id;
        this.section = section;
        this.car = car;
        this.model = model;
        this.year = year;
        this.type = type;
        this.volume = volume;
        this.equipment = equipment;
        this.price = price;
        this.milage = milage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getMilage() {
        return milage;
    }

    public void setMilage(Long milage) {
        this.milage = milage;
    }
}
