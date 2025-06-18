package mappers;

import com.example.demo1.Sport;
import dto.SportCreateForm;
import dto.SportUpdateForm;

public class SportMapper {

    /**
     * SportCreateForm to Sport
     * @param sportCreateForm
     * @return
     */
    public static Sport fromCreateForm(SportCreateForm sportCreateForm) {
        Sport sport = new Sport();
        sport.setSportName(sportCreateForm.getSportName());
        sport.setIsActive(sportCreateForm.getIsActive());
        sport.setPrice(sportCreateForm.getPrice());
        return sport;
    }

    /**
     * Update Sport
     * @param sport
     * @param sportUpdateForm
     */
    public static void fromUpdateForm(Sport sport, SportUpdateForm sportUpdateForm) {
        sport.setSportName(sportUpdateForm.getSportName());
        sport.setIsActive(sportUpdateForm.getIsActive());
        sport.setPrice(sportUpdateForm.getPrice());
    }
}
