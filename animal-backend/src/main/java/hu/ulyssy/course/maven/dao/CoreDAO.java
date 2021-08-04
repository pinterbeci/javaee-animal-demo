package hu.ulyssy.course.maven.dao;

import hu.ulyssys.java.course.maven.entity.entity.AbstractAnimal;
import hu.ulyssys.java.course.maven.entity.entity.Cat;

import java.util.List;


public interface CoreDAO<T> {
    List<T> findAll();

    T findById(Long id);

    T save(T entity);

    T update(T entity);

    void delete(Long id);
}
