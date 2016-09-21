package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.GraphicsProcessingUnitDao;
import ua.com.computerzone.model.entity.details.GraphicsProcessingUnit;
import ua.com.computerzone.service.GraphicsProcessingUnitService;

import java.util.List;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Transactional
@Service(value = "graphicsProcessingUnitService")
public class GraphicsProcessigUnitServiceImpl implements GraphicsProcessingUnitService {

    @Autowired
    GraphicsProcessingUnitDao graphicsProcessingUnitDao;
    @Override
    public List<GraphicsProcessingUnit> findAll() {
        return graphicsProcessingUnitDao.findAll();
    }

    @Override
    public void save(GraphicsProcessingUnit object) {
        graphicsProcessingUnitDao.saveItem(object);
    }

    @Override
    public GraphicsProcessingUnit findById(int id) {
        return graphicsProcessingUnitDao.findById(id);
    }

    @Override
    public void delete(GraphicsProcessingUnit object) {
        graphicsProcessingUnitDao.deleteItem(object);
    }
}
