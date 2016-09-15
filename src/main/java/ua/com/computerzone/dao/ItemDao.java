package ua.com.computerzone.dao;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
public interface ItemDao<T> {
    public List<T> findAll();

    public void saveItem(T object);

    public T findById(int id);

    public void deleteItem(T object);
}
