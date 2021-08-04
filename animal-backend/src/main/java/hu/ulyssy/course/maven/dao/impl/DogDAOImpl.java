package hu.ulyssy.course.maven.dao.impl;

import hu.ulyssy.course.maven.dao.DogDAO;
import hu.ulyssys.java.course.maven.entity.entity.Dog;


import javax.ejb.Stateless;

@Stateless
public class DogDAOImpl extends CoreDAOImpl<Dog> implements DogDAO {

    @Override
    protected Class<Dog> getManagedClass() {
        return Dog.class;
    }
}
