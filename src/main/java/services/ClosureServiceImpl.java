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
        em.persist(ClosureMapper.fromCreateForm(closureCreateForm));
    }

    @Override
    public void update(ClosureUpdateForm closureUpdateForm) {
        Closure closure = em.find(Closure.class, closureUpdateForm.getId());
        if(closure == null) throw new IllegalArgumentException("Not found");
        ClosureMapper.fromUpdateForm(closure, closureUpdateForm);
    }

    @Override
    public void delete(int id) {
        Closure closure = em.find(Closure.class, id);
        if(closure == null) throw new IllegalArgumentException("Not found");
        if (!closure.getIsActive()) throw new IllegalStateException("Closure with id " + id + " is not active");
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
