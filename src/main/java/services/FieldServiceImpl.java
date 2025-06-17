package services;

import com.example.demo1.Field;
import interfaces.FieldService;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class FieldServiceImpl implements FieldService {
    private final EntityManager em;

    public FieldServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Field field) {

        em.persist(field);
    }

    @Override
    public void update(Field field) {

        em.merge(field);
    }

    @Override
    public void delete(Field field) {

        field.setIsActive(false);
        em.merge(field);
    }

    @Override
    public Field getOneById(int id) {
        return null;
    }

    @Override
    public List<Field> getAllFields() {
        return Collections.emptyList();
    }
}
