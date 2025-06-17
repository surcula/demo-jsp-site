package mappers;

import com.example.demo1.SportField;
import dto.SportFieldCreateForm;
import dto.SportFieldUpdateForm;

public class SportFieldMapper {

    /**
     * Mapping sportFieldCreateForm to sportField
     * @param sportFieldCreateForm
     * @return
     */
    public static SportField fromCreateForm(SportFieldCreateForm sportFieldCreateForm) {
        SportField sportField = new SportField();
        sportField.setField(sportFieldCreateForm.getField());
        sportField.setSport(sportFieldCreateForm.getSport());
        sportField.setDay(sportFieldCreateForm.getDay());
        sportField.setDateStart(sportFieldCreateForm.getDateStart());
        sportField.setStartTime(sportFieldCreateForm.getStartTime());
        sportField.setEndTime(sportFieldCreateForm.getEndTime());
        sportField.setIsActive(sportFieldCreateForm.getIsActive());
        return sportField;
    }

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
        sportField.setIsActive(sportFieldUpdateForm.getIsActive());
    }
}
