package hu.ulyssys.java.course.javaee.demo.animal.dao.impl;

import hu.ulyssys.java.course.javaee.demo.animal.dao.CatDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Cat;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class CatDAOImpl extends CoreDAOImpl<Cat> implements CatDAO {

    @Override
    protected Class<Cat> getManagedClass() {
        return Cat.class;
    }
}