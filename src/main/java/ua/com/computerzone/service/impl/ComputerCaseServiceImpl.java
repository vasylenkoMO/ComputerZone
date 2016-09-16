package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.computerzone.dao.ComputerCaseDao;
import ua.com.computerzone.model.entity.details.ComputerCase;
import ua.com.computerzone.service.ComputerCaseService;

import java.util.List;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Service(value = "computerCaseService")
public class ComputerCaseServiceImpl implements ComputerCaseService {

    @Autowired
    ComputerCaseDao computerCaseDao;
    @Override
    public List<ComputerCase> findAll() {
        return computerCaseDao.findAll();
    }

    @Override
    public void save(ComputerCase object) {
        computerCaseDao.saveItem(object);
    }

    @Override
    public ComputerCase findById(int id) {
        return computerCaseDao.findById(id);
    }

    @Override
    public void delete(ComputerCase object) {
        computerCaseDao.deleteItem(object);
    }
}
