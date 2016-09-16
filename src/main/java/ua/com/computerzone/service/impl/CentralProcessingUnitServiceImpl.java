package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.CentralProcessingUnitDao;
import ua.com.computerzone.model.entity.details.CentralProcessingUnit;
import ua.com.computerzone.service.CentralProcessingUnitService;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Service(value = "centralProcessingUnitService")
@Transactional
public class CentralProcessingUnitServiceImpl implements CentralProcessingUnitService {

    @Autowired
    CentralProcessingUnitDao centralProcessingUnitDao;
    @Override
    public List<CentralProcessingUnit> findAll() {
        return centralProcessingUnitDao.findAll();
    }

    @Override
    public void save(CentralProcessingUnit object) {
        centralProcessingUnitDao.saveItem(object);
    }

    @Override
    public CentralProcessingUnit findById(int id) {
        return centralProcessingUnitDao.findById(id);
    }

    @Override
    public void delete(CentralProcessingUnit object) {
        centralProcessingUnitDao.deleteItem(object);
    }
}
