package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.HardDiskDriveDao;
import ua.com.computerzone.model.entity.details.HardDiskDrive;
import ua.com.computerzone.service.HardDiskDriveService;

import java.util.List;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Service(value = "hardDiskDriveService")
@Transactional
public class HardDiskDriveServiceImpl implements HardDiskDriveService{

    @Autowired
    HardDiskDriveDao hardDiskDriveDao;

    @Override
    public List<HardDiskDrive> findAll() {
        return hardDiskDriveDao.findAll();
    }

    @Override
    public void save(HardDiskDrive object) {
        hardDiskDriveDao.saveItem(object);
    }

    @Override
    public HardDiskDrive findById(int id) {
        return hardDiskDriveDao.findById(id);
    }

    @Override
    public void delete(HardDiskDrive object) {
        hardDiskDriveDao.deleteItem(object);
    }
}
