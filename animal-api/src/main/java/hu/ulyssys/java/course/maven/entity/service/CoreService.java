package hu.ulyssys.java.course.maven.entity.service;


import hu.ulyssys.java.course.maven.entity.entity.AbstractAnimal;

import java.util.List;

public interface CoreService<T> {
    List<T> getAll();

    void add(T entity);

    void remove(T entity);

    void update(T entity);
}
