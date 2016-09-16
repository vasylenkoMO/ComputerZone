package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.OrderHistoryDao;
import ua.com.computerzone.model.entity.Order;
import ua.com.computerzone.model.entity.OrderHistory;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "orderHistoryDao")
public class OrderHistoryDaoImpl extends AbstractDao<Integer, OrderHistory> implements OrderHistoryDao {
    @Override
    public List<OrderHistory> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<OrderHistory>) criteria.list();
    }

    @Override
    public void saveItem(OrderHistory object) {
        save(object);
    }

    @Override
    public OrderHistory findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(OrderHistory object) {
        delete(object);
    }
}
