package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.OrderDao;
import ua.com.computerzone.model.entity.Order;
import ua.com.computerzone.model.entity.details.Motherboard;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "orderDao")
public class OrderDaoImpl extends AbstractDao<Integer, Order> implements OrderDao {
    @Override
    public List<Order> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<Order>) criteria.list();
    }

    @Override
    public void saveItem(Order object) {
        save(object);
    }

    @Override
    public Order findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(Order object) {
        delete(object);
    }
}
