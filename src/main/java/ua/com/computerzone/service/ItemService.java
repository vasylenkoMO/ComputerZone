package ua.com.computerzone.service;

import java.util.List;

/**
 * Created by vastl271nko on 15.09.16.
 */
public interface ItemService<T> {
    public List<T> findAll();

    public void save(T object);

    public T findById(int id);

    public void delete(T object);
}
