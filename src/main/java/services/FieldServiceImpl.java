package services;

import com.example.demo1.Field;
import dto.FieldCreateForm;
import dto.FieldUpdateForm;
import interfaces.FieldService;
import mappers.FieldMapper;
import org.eclipse.persistence.jpa.jpql.parser.NullExpression;

import javax.persistence.EntityManager;
import java.util.Collections;
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
