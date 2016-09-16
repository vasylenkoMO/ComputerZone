package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.GraphicsProcessingUnitDao;
import ua.com.computerzone.model.entity.details.ComputerCase;
import ua.com.computerzone.model.entity.details.GraphicsProcessingUnit;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Repository(value = "graphicsProcessingUnitDao")
public class GraphicsProcessingUnitDaoImpl extends AbstractDao<Integer, GraphicsProcessingUnit> implements GraphicsProcessingUnitDao {
    @Override
    public List<GraphicsProcessingUnit> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<GraphicsProcessingUnit>) criteria.list();
    }

    @Override
    public void saveItem(GraphicsProcessingUnit object) {
        save(object);
    }

    @Override
    public GraphicsProcessingUnit findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(GraphicsProcessingUnit object) {
        delete(object);
    }
}
