package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sports")
public class Sport {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "sport_name", nullable = false)
    private String sportName;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}