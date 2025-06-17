package com.example.demo1;

import javax.persistence.*;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "subscription_name", nullable = false)
    private String subscriptionName;

    @Column(name = "token", nullable = false)
    private Integer token;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sport_id")
    private Sport sport;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public Integer getToken() {
        return token;
    }

    public void setToken(Integer token) {
        this.token = token;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}