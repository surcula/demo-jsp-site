package services;

import com.example.demo1.Field;
import interfaces.FieldService;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class SportFieldServiceImpl implements FieldService {
    private EntityManager em;

    public SportFieldServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(Field field) {

    }

    @Override
    public void update(Field field) {

    }

    @Override
    public void delete(Field field) {

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
