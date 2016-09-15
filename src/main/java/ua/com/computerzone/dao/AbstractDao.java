package ua.com.computerzone.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

/**
 * Created by vastl271nko on 15.09.16.
 */
public abstract class AbstractDao <PK extends Serializable, T> {

    @Autowired
    @Qualifier("sessionFactory")
    private SessionFactory sessionFactory;

    private final Class<T> persistentClass;

    protected AbstractDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType)
                this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    private Session currentSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }

    public void save(T entity) {
        getSession().save(entity);
    }

    public void delete(T entity) {
        getSession().delete(entity);
    }

    public void update(T entity) { getSession().merge(entity);}

    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistentClass);
    }
}
