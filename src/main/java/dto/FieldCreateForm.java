package dto;

import com.example.demo1.Hall;

import javax.persistence.*;

public class FieldCreateForm {

    private String fieldName;

    private Hall hall;

    private Boolean isActive = true;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
