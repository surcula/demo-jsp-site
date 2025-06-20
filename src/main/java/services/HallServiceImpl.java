package services;

import com.example.demo1.Hall;
import dto.HallCreateForm;
import dto.HallUpdateForm;
import mappers.HallMapper;

import javax.persistence.EntityManager;
import java.util.List;

public class HallServiceImpl implements interfaces.HallService {

    private final EntityManager em;

    public HallServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(HallCreateForm hallCreateForm) {
        em.persist(HallMapper.fromCreateForm(hallCreateForm));
    }

    @Override
    public void update(HallUpdateForm hallUpdateForm) {
        Hall hall = em.find(Hall.class, hallUpdateForm.getId());
        if (hall == null) throw new IllegalArgumentException("Not found");
        HallMapper.fromUpdateForm(hall, hallUpdateForm);
    }

    @Override
    public void delete(int id) {
        Hall hall = em.find(Hall.class, id);
        if (hall == null) throw new IllegalArgumentException("Not found");
        if (!hall.getIsActive()) throw new IllegalStateException("Hall with id " + id + " is not active");
        hall.setIsActive(false);
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
