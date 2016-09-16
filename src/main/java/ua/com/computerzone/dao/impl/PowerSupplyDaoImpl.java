package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.PowerSupplyDao;
import ua.com.computerzone.model.entity.PortableComputer;
import ua.com.computerzone.model.entity.details.PowerSupply;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "powerSupplyDao")
public class PowerSupplyDaoImpl extends AbstractDao<Integer, PowerSupply> implements PowerSupplyDao {
    @Override
    public List<PowerSupply> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<PowerSupply>) criteria.list();
    }

    @Override
    public void saveItem(PowerSupply object) {
        save(object);
    }

    @Override
    public PowerSupply findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(PowerSupply object) {
        delete(object);
    }
}
