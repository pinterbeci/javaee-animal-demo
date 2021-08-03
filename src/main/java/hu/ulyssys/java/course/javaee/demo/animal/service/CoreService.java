package hu.ulyssys.java.course.javaee.demo.animal.service;


import hu.ulyssys.java.course.javaee.demo.animal.entity.AbstractAnimal;

import java.util.List;

public interface CoreService<T> {
    List<T> getAll();

    void add(T entity);

    void remove(T entity);

    void update(T entity);
}
