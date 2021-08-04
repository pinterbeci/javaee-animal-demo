package hu.ulyssy.course.maven.dao.impl;

import hu.ulyssy.course.maven.dao.ReindeerDAO;
import hu.ulyssys.java.course.maven.entity.entity.Reindeer;
import hu.ulyssys.java.course.maven.entity.service.ReindeerService;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ReindeerDAOImpl extends CoreDAOImpl<Reindeer> implements ReindeerDAO {

    @Override
    protected Class<Reindeer> getManagedClass() {
        return Reindeer.class;
    }
}
