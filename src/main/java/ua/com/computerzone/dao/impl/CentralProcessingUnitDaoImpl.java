package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.CentralProcessingUnitDao;
import ua.com.computerzone.model.entity.details.CentralProcessingUnit;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "centralProcessingUnitDao")
public class CentralProcessingUnitDaoImpl extends AbstractDao<Integer, CentralProcessingUnit> implements
        CentralProcessingUnitDao {

    @Override
    public List<CentralProcessingUnit> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<CentralProcessingUnit>) criteria.list();
    }

    @Override
    public void saveItem(CentralProcessingUnit object) {
        save(object);
    }

    @Override
    public CentralProcessingUnit findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(CentralProcessingUnit object) {
        delete(object);
    }
}
