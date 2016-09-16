package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.PortableComputerDao;
import ua.com.computerzone.model.entity.PersonalComputer;
import ua.com.computerzone.model.entity.PortableComputer;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "portableComputerDao")
public class PortableComputerDaoImpl extends AbstractDao<Integer, PortableComputer> implements PortableComputerDao {
    @Override
    public List<PortableComputer> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<PortableComputer>) criteria.list();
    }

    @Override
    public void saveItem(PortableComputer object) {
        save(object);
    }

    @Override
    public PortableComputer findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(PortableComputer object) {
        delete(object);
    }
}
