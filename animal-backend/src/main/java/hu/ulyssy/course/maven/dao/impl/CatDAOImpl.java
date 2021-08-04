package hu.ulyssy.course.maven.dao.impl;

import hu.ulyssy.course.maven.dao.CatDAO;
import hu.ulyssys.java.course.maven.entity.entity.Cat;

import javax.ejb.Stateless;


@Stateless
public class CatDAOImpl extends CoreDAOImpl<Cat> implements CatDAO {

    @Override
    protected Class<Cat> getManagedClass() {
        return Cat.class;
    }
}