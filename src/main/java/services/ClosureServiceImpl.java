package services;

import dto.ClosureCreateForm;
import com.example.demo1.Closure;
import dto.ClosureUpdateForm;
import interfaces.ClosureService;
import mappers.ClosureMapper;

import javax.persistence.EntityManager;
import java.util.List;

public class ClosureServiceImpl implements ClosureService {

    private final EntityManager em;

    public ClosureServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(ClosureCreateForm closureCreateForm) {
        Closure closure = ClosureMapper.fromCreateForm(closureCreateForm);
        em.persist(closure);
    }

    @Override
    public void update(ClosureUpdateForm closureUpdateForm) {
        Closure closure = em.find(Closure.class, closureUpdateForm.getId());
        if(closure == null) throw new IllegalArgumentException("Not found");
        ClosureMapper.fromUpdateForm(closure, closureUpdateForm);
        em.merge(closure);
    }

    @Override
    public void delete(Closure closure) {
        closure.setIsActive(false);
    }

    @Override
    public Closure getOneById(int id) {
        return em.find(Closure.class, id);
    }

    @Override
    public List<Closure> getAllClosures() {
        return em.createQuery("Select c from Closure c", Closure.class).getResultList();
    }
}
