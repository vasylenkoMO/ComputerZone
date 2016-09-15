package ua.com.computerzone.dao.impl;

import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.CategoryDao;
import ua.com.computerzone.model.entity.Category;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vastl271nko on 27.08.16.
 */
@Repository(value = "categoryDao")
public class CategoryDaoImpl extends AbstractDao<Integer, Category> implements CategoryDao {

    public CategoryDaoImpl() {
    }

    @Override
    public List<Category> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Category>) criteria.list();
    }

    @Override
    public void saveItem(Category object) {
        save(object);
    }

    @Override
    public Category findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(Category object) {
        delete(object);
    }
}
