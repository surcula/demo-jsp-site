package dto;

import javax.persistence.Column;
import javax.persistence.Id;

public class HallCreateForm {

    private String hallName;

    private Boolean isActive = true;

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
