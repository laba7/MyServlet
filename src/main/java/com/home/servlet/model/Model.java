package com.home.servlet.model;

/**
 * Created by User on 03.09.2016.
 */

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Table(name = "MODEL")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;
//    @OneToMany(fetch = FetchType.EAGER)
    @Column(name = "ID_BRAND")
    private Long idBrand;
    @Column(name = "MODEL")
    private String model;


    public Model(Long idBrand, String model) {
        this.model = model;
        this.idBrand = idBrand;
    }

    public Model() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getIdBrand() {
        return idBrand;
    }

    public void setIdBrand(Long idBrand) {
        this.idBrand = idBrand;
    }
}
