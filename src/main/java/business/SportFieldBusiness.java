package business;

import entities.SportField;
import dto.SportFieldCreateForm;
import dto.SportFieldUpdateForm;

public class SportFieldBusiness {

    /**
     * update sportfield
     * @param sportField
     * @param sportFieldUpdateForm
     */
    public static void fromUpdateForm(SportField sportField,SportFieldUpdateForm sportFieldUpdateForm) {
        sportField.setField(sportFieldUpdateForm.getField());
        sportField.setSport(sportFieldUpdateForm.getSport());
        sportField.setDay(sportFieldUpdateForm.getDay());
        sportField.setDateStart(sportFieldUpdateForm.getDateStart());
        sportField.setStartTime(sportFieldUpdateForm.getStartTime());
        sportField.setEndTime(sportFieldUpdateForm.getEndTime());
        sportField.setActive(sportFieldUpdateForm.isActive());
    }
}
