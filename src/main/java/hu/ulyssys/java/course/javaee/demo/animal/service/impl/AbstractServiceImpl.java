package hu.ulyssys.java.course.javaee.demo.animal.service.impl;


import hu.ulyssys.java.course.javaee.demo.animal.dao.CoreDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.AbstractEntity;
import hu.ulyssys.java.course.javaee.demo.animal.service.CoreService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public abstract class AbstractServiceImpl<T extends AbstractEntity> implements CoreService<T> {
    @Inject
    protected CoreDAO<T> dao;

    @Override
    public List<T> getAll() {
        return dao.findAll();
    }

    @Transactional
    @Override
    public void add(T entity) {
        dao.save(entity);
    }

    @Transactional
    @Override
    public void remove(T entity) {
        dao.delete(entity.getId());
    }

    @Transactional
    @Override
    public void update(T entity) {
        dao.update(entity);
    }

}