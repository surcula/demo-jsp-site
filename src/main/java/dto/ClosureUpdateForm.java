package dto;

import com.example.demo1.SportField;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ClosureUpdateForm {
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

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @NotNull(message = "Id is required")
    private int Id;

    @NotNull(message = "Start date is required")
    private LocalDate startDate;

    @NotNull(message = "End date is required")
    private LocalDate endDate;

    @NotNull(message = "SportField is required")
    private SportField sportField;

    private Boolean isActive = true;
}
