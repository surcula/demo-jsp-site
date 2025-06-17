package services;

import com.example.demo1.Hall;

import javax.persistence.EntityManager;
import java.util.List;

public class HallServiceImpl implements interfaces.HallService {

    private EntityManager em;

    public HallServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Hall hall) {
        em.persist(hall);
    }

    @Override
    public void update(Hall hall) {
        em.merge(hall);
    }

    @Override
    public void delete(Hall hall) {
        hall.setIsActive(false);
        em.merge(hall);
    }

    @Override
    public Hall getOneById(int id) {
        return em.find(Hall.class, id);
    }

    @Override
    public List<Hall> getAllHalls() {
        return em.createQuery("select h from Hall h", Hall.class).getResultList();
    }
}
