package business;

import entities.Sport;
import dto.SportCreateForm;
import dto.SportUpdateForm;

public class SportBusiness {


    /**
     * Update Sport
     * @param sport
     * @param sportUpdateForm
     */
    public static void fromUpdateForm(Sport sport, SportUpdateForm sportUpdateForm) {
        sport.setSportName(sportUpdateForm.getSportName());
        sport.setActive(sportUpdateForm.isActive());
        sport.setPrice(sportUpdateForm.getPrice());
    }
}
