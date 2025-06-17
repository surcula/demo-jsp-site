package dto;

import com.example.demo1.SportField;
import jakarta.validation.constraints.NotNull;



import java.time.LocalDate;

public class ClosureCreateForm {

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public SportField getSportField() {
        return sportField;
    }

    public void setSportField(SportField sportField) {
        this.sportField = sportField;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean active) {
        isActive = active;
    }

    @NotNull(message = "Start date is required")
    private LocalDate startDate;

    private LocalDate endDate;

    private SportField sportField;

    private Boolean isActive = true;
}
