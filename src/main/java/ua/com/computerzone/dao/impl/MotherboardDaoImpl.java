package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.MotherboardDao;
import ua.com.computerzone.model.entity.details.Motherboard;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository( value = "motherBoardDao")
public class MotherboardDaoImpl extends AbstractDao<Integer, Motherboard> implements MotherboardDao {
    @Override
    public List<Motherboard> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Motherboard>) criteria.list();
    }

    @Override
    public void saveItem(Motherboard object) {
        save(object);
    }

    @Override
    public Motherboard findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(Motherboard object) {
        delete(object);
    }
}
