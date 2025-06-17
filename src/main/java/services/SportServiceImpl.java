package services;

import com.example.demo1.Sport;
import interfaces.SportService;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class SportServiceImpl implements SportService {
    private EntityManager em;

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
    public void delete(Sport sport) {

    }

    @Override
    public Sport getOneById(int id) {
        return null;
    }

    @Override
    public List<Sport> getAllSports() {
        return Collections.emptyList();
    }
}
