package interfaces;

import com.example.demo1.Sport;
import dto.SportCreateForm;
import dto.SportUpdateForm;

import java.util.List;

public interface SportService {

    /**
     * Create a new sport
     * @param sportCreateForm
     */
    void create(SportCreateForm sportCreateForm) ;

    /**
     * Update an existing sport
     * @param sportUpdateForm
     */
    void update(SportUpdateForm sportUpdateForm) ;

    /**
     * soft-delete a sport by setting its isActive flag to false
     * @param id
     */
    void delete(int id) ;

    /**
     * retrieve a sport by its Id
     * @param id
     * @return Sport
     */
    Sport getOneById(int id);

    /**
     * retrieves all sports
     * @return a list of all sports
     */
    List<Sport> getAllSports() ;
}
