package services;

import com.example.demo1.Field;
import dto.FieldCreateForm;
import dto.FieldUpdateForm;
import interfaces.FieldService;
import mappers.FieldMapper;

import javax.persistence.EntityManager;
import java.util.List;

public class FieldServiceImpl implements FieldService {
    private final EntityManager em;

    public FieldServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(FieldCreateForm fieldCreateForm) {
        em.persist(FieldMapper.fromCreateForm(fieldCreateForm));
    }

    @Override
    public void update(FieldUpdateForm fieldUpdateForm) {
        Field field = em.find(Field.class, fieldUpdateForm.getId());
        if(field == null)throw new IllegalArgumentException("not found");
        FieldMapper.fromUpdateForm(field,fieldUpdateForm);
    }

    @Override
    public void delete(int id) {

        Field field = em.find(Field.class, id);
        if(field == null) throw new IllegalArgumentException("Not found");
        if (!field.getIsActive()) throw new IllegalStateException("Field with id " + id + " is not active");
        field.setIsActive(false);
    }

    @Override
    public Field getOneById(int id) {
        return em.find(Field.class, id);
    }

    @Override
    public List<Field> getAllFields() {

        return em.createQuery("select f from Field f", Field.class).getResultList();
    }
}
