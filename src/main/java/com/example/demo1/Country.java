package com.example.demo1;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "iso_alpha3", nullable = false)
    private String isoAlpha3;

    @Column(name = "isActive", nullable = false)
    private Boolean isActive = true;



    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

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

    public String getIsoAlpha3() {
        return isoAlpha3;
    }

    public void setIsoAlpha3(String isoAlpha3) {
        this.isoAlpha3 = isoAlpha3;
    }

    public Country(Integer id, String label, String isoAlpha3) {
        this.id = id;
        this.label = label;
        this.isoAlpha3 = isoAlpha3;
    }
    public Country() {}

}