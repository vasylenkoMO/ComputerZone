package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.StatusDao;
import ua.com.computerzone.model.entity.Status;
import ua.com.computerzone.service.StatusService;

import java.util.List;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Service(value = "statusService")
@Transactional
public class StatusServiceImpl implements StatusService {

    @Autowired
    StatusDao statusDao;
    @Override
    public List<Status> findAll() {
        return statusDao.findAll();
    }

    @Override
    public void save(Status object) {
        statusDao.saveItem(object);
    }

    @Override
    public Status findById(int id) {
        return statusDao.findById(id);
    }

    @Override
    public void delete(Status object) {
        statusDao.deleteItem(object);
    }
}
