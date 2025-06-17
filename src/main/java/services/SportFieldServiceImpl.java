package services;

import com.example.demo1.SportField;
import dto.SportFieldCreateForm;
import dto.SportFieldUpdateForm;
import interfaces.SportFieldService;
import mappers.SportFieldMapper;

import javax.persistence.EntityManager;
import java.util.List;

public class SportFieldServiceImpl implements SportFieldService {
    private final EntityManager em;

    public SportFieldServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(SportFieldCreateForm sportFieldCreateForm) {
        em.persist(SportFieldMapper.fromCreateForm(sportFieldCreateForm));
    }

    @Override
    public void update(SportFieldUpdateForm sportFieldUpdateForm) {
        SportField sportField = em.find(SportField.class, sportFieldUpdateForm.getId());
        if (sportField == null) throw new IllegalArgumentException("Not Found");
        SportFieldMapper.fromUpdateForm(sportField, sportFieldUpdateForm);

    }

    @Override
    public void delete(int id) {

        SportField sportField = em.find(SportField.class, id);
        if (sportField == null) throw new IllegalArgumentException("Not Found");
        if (!sportField.getIsActive()) throw new IllegalStateException("sportField with id " + id + " is not active");
        sportField.setIsActive(false);
    }

    @Override
    public SportField getOneById(int id) {
        return em.find(SportField.class, id);
    }

    @Override
    public List<SportField> getAllSportFields() {
        return em.createQuery("Select s from SportField s", SportField.class).getResultList();
    }
}
