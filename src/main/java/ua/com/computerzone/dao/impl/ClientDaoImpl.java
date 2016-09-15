package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.ClientDao;
import ua.com.computerzone.model.entity.Client;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
public class ClientDaoImpl extends AbstractDao<Integer, Client> implements ClientDao {
    @Override
    public List<Client> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Client>) criteria.list();
    }

    @Override
    public void saveItem(Client object) {
        save(object);
    }

    @Override
    public Client findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(Client object) {
        delete(object);
    }
}
