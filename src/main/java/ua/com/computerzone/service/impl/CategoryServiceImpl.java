package ua.com.computerzone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.computerzone.dao.CategoryDao;
import ua.com.computerzone.model.entity.Category;
import ua.com.computerzone.service.CategoryService;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
@Service(value = "categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public void save(Category object) {
        categoryDao.saveItem(object);
    }

    @Override
    public Category findById(int id) {
        return categoryDao.findById(id);
    }

    @Override
    public void deleteItem(Category object) {
        categoryDao.deleteItem(object);
    }
}
