package hu.ulyssys.java.course.javaee.demo.animal.dao.impl;

import hu.ulyssys.java.course.javaee.demo.animal.dao.SlugDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Slug;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@ApplicationScoped
public class SlugDAOImpl extends CoreDAOImpl<Slug> implements SlugDAO {

    @Override
    protected Class<Slug> getManagedClass() {
        return Slug.class;
    }
}