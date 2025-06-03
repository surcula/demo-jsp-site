package com.example.demo1;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "reservations")
public class Reservation {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "label", nullable = false)
    private String label;

    @Column(name = "start_date_reservation", nullable = false)
    private Instant startDateReservation;

    @Column(name = "end_date_reservation", nullable = false)
    private Instant endDateReservation;

    @Column(name = "price", nullable = false, precision = 15, scale = 2)
    private BigDecimal price;

    @Column(name = "tva", nullable = false, precision = 15, scale = 2)
    private BigDecimal tva;

    @Lob
    @Column(name = "statut", nullable = false)
    private String statut;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sportsFieldId")
    private SportsField sportsField;

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

    public Instant getStartDateReservation() {
        return startDateReservation;
    }

    public void setStartDateReservation(Instant startDateReservation) {
        this.startDateReservation = startDateReservation;
    }

    public Instant getEndDateReservation() {
        return endDateReservation;
    }

    public void setEndDateReservation(Instant endDateReservation) {
        this.endDateReservation = endDateReservation;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTva() {
        return tva;
    }

    public void setTva(BigDecimal tva) {
        this.tva = tva;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SportsField getSportsField() {
        return sportsField;
    }

    public void setSportsField(SportsField sportsField) {
        this.sportsField = sportsField;
    }

}