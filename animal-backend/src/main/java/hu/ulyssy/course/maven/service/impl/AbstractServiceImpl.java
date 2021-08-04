package hu.ulyssy.course.maven.service.impl;


import hu.ulyssy.course.maven.dao.CoreDAO;
import hu.ulyssys.java.course.maven.entity.entity.AbstractEntity;
import hu.ulyssys.java.course.maven.entity.service.CoreService;

import javax.inject.Inject;
import java.util.List;

public abstract class AbstractServiceImpl<T extends AbstractEntity> implements CoreService<T> {
    @Inject
    protected CoreDAO<T> dao;

    @Override
    public List<T> getAll() {
        return dao.findAll();
    }

    //leszedni

    @Override
    public void add(T entity) {
        dao.save(entity);
    }

    //leszedni

    @Override
    public void remove(T entity) {
        dao.delete(entity.getId());
    }

    //leszedni

    @Override
    public void update(T entity) {
        dao.update(entity);
    }

}