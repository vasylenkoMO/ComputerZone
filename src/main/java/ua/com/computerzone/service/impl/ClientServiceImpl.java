package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.ClientDao;
import ua.com.computerzone.model.entity.Client;
import ua.com.computerzone.service.ClientService;

import java.util.List;

/**
 * Created by vastl271nko on 16.09.16.
 */
@Service(value = "clientService")
@Transactional
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientDao clientDao;

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

    @Override
    public void save(Client object) {
        clientDao.saveItem(object);
    }

    @Override
    public Client findById(int id) {
        return clientDao.findById(id);
    }

    @Override
    public void delete(Client object) {
        clientDao.deleteItem(object);
    }
}
