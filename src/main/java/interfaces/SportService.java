package interfaces;

import com.example.demo1.Sport;

import java.util.List;

public interface SportService {

    /**
     * Create a new sport
     * @param sport
     */
    void create(Sport sport) ;

    /**
     * Update an existing sport
     * @param sport
     */
    void update(Sport sport) ;

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
