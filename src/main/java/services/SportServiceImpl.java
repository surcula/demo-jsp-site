package services;

import com.example.demo1.Sport;
import dto.SportCreateForm;
import dto.SportUpdateForm;
import interfaces.SportService;
import mappers.SportMapper;

import javax.persistence.EntityManager;
import java.util.List;

public class SportServiceImpl implements SportService {
    private final EntityManager em;

    public SportServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(SportCreateForm sportCreateForm) {
        em.persist(SportMapper.fromCreateForm(sportCreateForm));
    }

    @Override
    public void update(SportUpdateForm sportUpdateForm) {

        Sport sport = em.find(Sport.class, sportUpdateForm.getId());
        if (sport == null) throw new IllegalArgumentException("Sport with id " + sport.getId() + " not found");
        SportMapper.fromUpdateForm(sport, sportUpdateForm);
    }

    @Override
    public void delete(int id) {
        Sport sport = em.find(Sport.class, id);
        if (sport == null) throw new IllegalArgumentException("Sport with id " + id + " not found");
        if(!sport.getIsActive()) throw new IllegalArgumentException("Sport with id " + id + " is not active");
        sport.setIsActive(false);
    }

    @Override
    public Sport getOneById(int id) {
        return em.find(Sport.class, id);
    }

    @Override
    public List<Sport> getAllSports() {
        return em.createQuery("Select s from Sport s", Sport.class).getResultList();
    }
}
