package com.example.demo1;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "zip_code", nullable = false)
    private Integer zipCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countrieId")
    private Country country;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}