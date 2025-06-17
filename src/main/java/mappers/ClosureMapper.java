package mappers;

import com.example.demo1.Closure;
import dto.ClosureCreateForm;
import dto.ClosureUpdateForm;

public class ClosureMapper {

    /**
     * Mapping ClosureForm to Closure
     * @param closureCreateForm
     * @return
     */
    public static Closure fromCreateForm(ClosureCreateForm closureCreateForm){
        Closure closure = new Closure();
        closure.setEndDate(closureCreateForm.getEndDate());
        closure.setStartDate(closureCreateForm.getStartDate());
        closure.setIsActive(closureCreateForm.getIsActive());
        closure.setSportsField(closureCreateForm.getSportField());
        return  closure;
    }

    /**
     * update the closure
     * @param closure the existing closure entity to update
     * @param closureUpdateForm the form containing the new value
     */
    public static void fromUpdateForm(Closure closure,ClosureUpdateForm closureUpdateForm){
        closure.setEndDate(closureUpdateForm.getEndDate());
        closure.setStartDate(closureUpdateForm.getStartDate());
        closure.setIsActive(closureUpdateForm.getIsActive());
        closure.setSportsField(closureUpdateForm.getSportField());
    }
}
