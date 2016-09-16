package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.PersonalComputerDao;
import ua.com.computerzone.model.entity.OrderHistory;
import ua.com.computerzone.model.entity.PersonalComputer;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "personalComputerDao")
public class PersonalComputerDaoImpl extends AbstractDao<Integer, PersonalComputer> implements PersonalComputerDao {
    @Override
    public List<PersonalComputer> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<PersonalComputer>) criteria.list();
    }

    @Override
    public void saveItem(PersonalComputer object) {
        save(object);
    }

    @Override
    public PersonalComputer findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(PersonalComputer object) {
        delete(object);
    }
}
