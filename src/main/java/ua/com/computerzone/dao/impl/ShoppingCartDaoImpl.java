package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.ShoppingCartDao;
import ua.com.computerzone.model.entity.ShoppingCart;

import java.util.List;

/**
 * Created by vastl271nko on 16.09.16.
 */
public class ShoppingCartDaoImpl extends AbstractDao<Integer, ShoppingCart> implements ShoppingCartDao {
    @Override
    public List<ShoppingCart> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<ShoppingCart>) criteria.list();
    }

    @Override
    public void saveItem(ShoppingCart object) {
        save(object);
    }

    @Override
    public ShoppingCart findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(ShoppingCart object) {
        delete(object);
    }
}
