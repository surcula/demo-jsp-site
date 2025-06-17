package interfaces;

import dto.ClosureCreateForm;
import com.example.demo1.Closure;
import dto.ClosureUpdateForm;

import java.util.List;

public interface ClosureService {
    /**
     * Create a new closure
     * @param closureCreateForm
     */
    void create(ClosureCreateForm closureCreateForm) ;

    /**
     * Update an existing closure
     * @param closureUpdateForm
     */
    void update(ClosureUpdateForm  closureUpdateForm) ;

    /**
     * soft-delete a closure by setting its isActive flag to false
     * @param closure
     */
    void delete(Closure closure) ;

    /**
     * retrieves a closure by its Id
     * @param id
     * @return Closure
     */
    Closure  getOneById(int id);

    /**
     * retrieves all closures
     * @return list of all Closures
     */
    List<Closure> getAllClosures() ;
}
