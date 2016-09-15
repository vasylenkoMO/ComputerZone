package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.ComputerCaseDao;
import ua.com.computerzone.model.entity.Client;
import ua.com.computerzone.model.entity.details.ComputerCase;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
public class ComputerCaseDaoImpl extends AbstractDao<Integer, ComputerCase> implements ComputerCaseDao {
    @Override
    public List<ComputerCase> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<ComputerCase>) criteria.list();
    }

    @Override
    public void saveItem(ComputerCase object) {
        save(object);
    }

    @Override
    public ComputerCase findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(ComputerCase object) {
        delete(object);
    }
}
