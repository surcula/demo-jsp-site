package com.example.demo1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "event_name", nullable = false)
    private String eventName;

    @Column(name = "begin_date_hour", nullable = false)
    private LocalDate beginDateHour;

    @Column(name = "end_date_hour", nullable = false)
    private LocalDate endDateHour;

    @Column(name = "info", nullable = false)
    private String info;

    @Column(name = "picture", nullable = false)
    private String picture;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive = true;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getBeginDateHour() {
        return beginDateHour;
    }

    public void setBeginDateHour(LocalDate beginDateHour) {
        this.beginDateHour = beginDateHour;
    }

    public LocalDate getEndDateHour() {
        return endDateHour;
    }

    public void setEndDateHour(LocalDate endDateHour) {
        this.endDateHour = endDateHour;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

}