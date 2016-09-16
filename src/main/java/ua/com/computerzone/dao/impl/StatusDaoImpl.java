package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.StatusDao;
import ua.com.computerzone.model.entity.Status;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "statusDao")
public class StatusDaoImpl extends AbstractDao<Integer, Status> implements StatusDao {
    @Override
    public List<Status> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Status>) criteria.list();
    }

    @Override
    public void saveItem(Status object) {
        save(object);
    }

    @Override
    public Status findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(Status object) {
        delete(object);
    }
}
