package hu.ulyssy.course.maven.dao.impl;

import hu.ulyssy.course.maven.dao.CoreDAO;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


public abstract class CoreDAOImpl<T> implements CoreDAO<T> {

    @PersistenceContext(unitName = "TestPersistence")
    protected EntityManager entityManager;

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("select n from " + getManagedClass().getSimpleName()
                + " n order by n.id", getManagedClass()).getResultList();
    }

    @Override
    public T findById(Long id) {
        return entityManager.find(getManagedClass(), id);
    }


    @Override
    public T save(T entity) {
        entityManager.persist(entity);
        return entity;
    }


    @Override
    public T update(T entity) {
        return entityManager.merge(entity);
    }


    @Override
    public void delete(Long id) {
        entityManager.remove(findById(id));
    }

    //Reflectionnel el lehet kérni
    protected abstract Class<T> getManagedClass();
}
