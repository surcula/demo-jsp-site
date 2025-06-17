package com.example.demo1;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "country_name", nullable = false)
    private String countryName;

    @Column(name = "iso_alpha3", nullable = false)
    private String isoAlpha3;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Country(Integer id, String countryName, String isoAlpha3) {
        this.id = id;
        this.countryName = countryName;
        this.isoAlpha3 = isoAlpha3;
    }

    public Country() {

    }
}