package interfaces;

import com.example.demo1.Field;
import dto.FieldCreateForm;
import dto.FieldUpdateForm;

import java.util.List;

public interface FieldService {
    /**
     * Create a new field
     * @param fieldCreateForm
     */
    void create(FieldCreateForm fieldCreateForm) ;

    /**
     * Update an existing field
     * @param fieldUpdateForm
     */
    void update(FieldUpdateForm fieldUpdateForm) ;

    /**
     * soft-delete a field by setting its isActive flag to false
     * @param id
     */
    void delete(int id) ;

    /**
     * retrieves a field by its id
     * @param id
     * @return Field
     */
    Field getOneById(int id);

    /**
     * retrieves all fields
     * @return a list of all fields
     */
    List<Field> getAllFields() ;
}
