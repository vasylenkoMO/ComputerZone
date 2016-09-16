package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.RandomAccessMemoryDao;
import ua.com.computerzone.model.entity.details.PowerSupply;
import ua.com.computerzone.model.entity.details.RandomAccessMemory;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "randomAccessMemoryDao")
public class RandomAccessMemoryDaoImpl extends AbstractDao<Integer, RandomAccessMemory> implements RandomAccessMemoryDao {
    @Override
    public List<RandomAccessMemory> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<RandomAccessMemory>) criteria.list();
    }

    @Override
    public void saveItem(RandomAccessMemory object) {
        save(object);
    }

    @Override
    public RandomAccessMemory findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(RandomAccessMemory object) {
        delete(object);
    }
}
