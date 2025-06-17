package services;

import com.example.demo1.Field;
import com.example.demo1.SportField;
import interfaces.SportFieldService;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class SportFieldServiceImpl implements SportFieldService {
    private EntityManager em;

    public SportFieldServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(SportField sportField) {

    }

    @Override
    public void update(SportField sportField) {

    }

    @Override
    public void delete(SportField sportField) {

    }

    @Override
    public SportField getOneById(int id) {
        return null;
    }

    @Override
    public List<SportField> getAllSportFields() {
        return Collections.emptyList();
    }
}
