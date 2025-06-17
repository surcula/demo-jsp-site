package mappers;

import com.example.demo1.Field;
import dto.FieldCreateForm;
import dto.FieldUpdateForm;

public class FieldMapper {
    /**
     * FieldCreateForm to field
     * @param fieldCreateForm
     * @return
     */
    public static Field fromCreateForm(FieldCreateForm fieldCreateForm) {
        Field field = new Field();
        field.setFieldName(fieldCreateForm.getFieldName());
        field.setHall(fieldCreateForm.getHall());
        field.setIsActive(fieldCreateForm.getIsActive());
        return field;
    }

    /**
     * Update field
     * @param field
     * @param fieldUpdateForm
     */
    public static void fromUpdateForm(Field field, FieldUpdateForm fieldUpdateForm) {
        field.setFieldName(fieldUpdateForm.getFieldName());
        field.setHall(fieldUpdateForm.getHall());
        field.setIsActive(fieldUpdateForm.getIsActive());
    }
}
