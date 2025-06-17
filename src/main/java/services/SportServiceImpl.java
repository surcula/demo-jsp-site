package services;

import com.example.demo1.Closure;
import com.example.demo1.Sport;
import interfaces.SportService;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class SportServiceImpl implements SportService {
    private final EntityManager em;

    public SportServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Sport sport) {

    }

    @Override
    public void update(Sport sport) {

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
