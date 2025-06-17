package mappers;

import com.example.demo1.Hall;
import dto.FieldUpdateForm;
import dto.HallCreateForm;
import dto.HallUpdateForm;

public class HallMapper {

    /**
     * Mapper HallCreateForm to Hall
     * @param hallCreateForm
     * @return
     */
    public static Hall fromCreateForm(HallCreateForm hallCreateForm) {
        Hall hall = new Hall();
        hall.setIsActive(hallCreateForm.getIsActive());
        hall.setHallName(hallCreateForm.getHallName());
        return hall;
    }

    /**
     * Update Hall
     * @param hall
     * @param hallUpdateForm
     */
    public static void fromUpdateForm(Hall hall, HallUpdateForm hallUpdateForm) {
        hall.setHallName(hallUpdateForm.getHallName());
        hall.setIsActive(hallUpdateForm.getIsActive());
    }
}
