package business;

import entities.Field;
import dto.FieldCreateForm;
import dto.FieldUpdateForm;

public class FieldBusiness {

    /**
     * Update field
     * @param field
     * @param fieldUpdateForm
     */
    public static void fromUpdateForm(Field field, FieldUpdateForm fieldUpdateForm) {
        field.setFieldName(fieldUpdateForm.getFieldName());
        field.setHall(fieldUpdateForm.getHall());
        field.setActive(fieldUpdateForm.isActive());
    }
}
