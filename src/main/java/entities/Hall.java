package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "halls")
public class Hall {
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "hall_name", nullable = false)
    private String hallName;

    @Column(name = "is_active", nullable = false)
    private boolean active = true;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}