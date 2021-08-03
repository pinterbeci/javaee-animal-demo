package hu.ulyssys.java.course.javaee.demo.animal.dao.impl;

import hu.ulyssys.java.course.javaee.demo.animal.dao.DogDAO;
import hu.ulyssys.java.course.javaee.demo.animal.dao.SlugDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Cat;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Dog;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Slug;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class DogDAOImpl extends CoreDAOImpl<Dog> implements DogDAO {

    @Override
    protected Class<Dog> getManagedClass() {
        return Dog.class;
    }
}
