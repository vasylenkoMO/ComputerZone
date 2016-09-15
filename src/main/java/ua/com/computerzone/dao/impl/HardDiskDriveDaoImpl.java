package ua.com.computerzone.dao.impl;

import org.hibernate.Criteria;
import ua.com.computerzone.dao.AbstractDao;
import ua.com.computerzone.dao.HardDiskDriveDao;
import ua.com.computerzone.model.entity.details.HardDiskDrive;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
public class HardDiskDriveDaoImpl extends AbstractDao<Integer, HardDiskDrive> implements HardDiskDriveDao {
    @Override
    public List<HardDiskDrive> findAll() {
        Criteria criteria = createEntityCriteria();
        return (List<HardDiskDrive>) criteria.list();
    }

    @Override
    public void saveItem(HardDiskDrive object) {
        save(object);
    }

    @Override
    public HardDiskDrive findById(int id) {
        return getByKey(id);
    }

    @Override
    public void deleteItem(HardDiskDrive object) {
        delete(object);
    }
}
