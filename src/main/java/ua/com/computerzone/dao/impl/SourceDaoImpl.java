package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.SourceDao;
import ua.com.computerzone.model.entity.Source;
import ua.com.computerzone.model.entity.details.RandomAccessMemory;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "sourceDao")
public class SourceDaoImpl extends AbstractDao<Integer, Source> implements SourceDao {
    @Override
    public List<Source> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Source>) criteria.list();
    }

    @Override
    public void saveItem(Source object) {
        save(object);
    }

    @Override
    public Source findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(Source object) {
        delete(object);
    }
}
