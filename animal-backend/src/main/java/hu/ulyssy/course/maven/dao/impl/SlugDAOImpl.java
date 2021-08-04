package hu.ulyssy.course.maven.dao.impl;

import hu.ulyssy.course.maven.dao.SlugDAO;
import hu.ulyssys.java.course.maven.entity.entity.Slug;

import javax.ejb.Stateless;

@Stateless
public class SlugDAOImpl extends CoreDAOImpl<Slug> implements SlugDAO {

    @Override
    protected Class<Slug> getManagedClass() {
        return Slug.class;
    }
}