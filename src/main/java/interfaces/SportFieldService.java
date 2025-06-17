package interfaces;

import com.example.demo1.SportField;
import dto.SportFieldCreateForm;
import dto.SportFieldUpdateForm;

import java.util.List;

public interface SportFieldService {

    /**
     * Create a new sportField
     * @param sportFieldCreateForm
     */
    void create(SportFieldCreateForm sportFieldCreateForm) ;

    /**
     * Update an existing sportField
     * @param sportFieldUpdateForm
     */
    void update(SportFieldUpdateForm sportFieldUpdateForm) ;

    /**
     * soft-delete a sportField by setting its isActive flag to false
     * @param id
     */
    void delete(int id) ;

    /**
     * retrieves a sportField by its Id
     * @param id
     * @return SportField
     */
    SportField getOneById(int id);

    /**
     * retrieves all SportFields
     * @return a list of all SportFields
     */
    List<SportField> getAllSportFields() ;
}
