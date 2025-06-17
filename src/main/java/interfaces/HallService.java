package interfaces;

import com.example.demo1.Hall;
import dto.HallCreateForm;
import dto.HallUpdateForm;

import java.util.List;

public interface HallService {

    /**
     * Create a new hall
     * @param hallCreateForm
     */
    void create(HallCreateForm hallCreateForm) ;

    /**
     * Update an existing hall
     * @param hallUpdateForm
     */
    void update(HallUpdateForm hallUpdateForm) ;

    /**
     * soft-delete a hall by setting its isActive flag to false
     * @param id
     */
    void delete(int id) ;

    /**
     * retrieves a hall by its id
     * @param id
     * @return Hall
     */
    Hall getOneById(int id);

    /**
     * retrieves all halls
     * @return a list of all halls
     */
    List<Hall> getAllHalls() ;
}
