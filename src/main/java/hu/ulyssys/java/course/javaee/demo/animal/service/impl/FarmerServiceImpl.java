package hu.ulyssys.java.course.javaee.demo.animal.service.impl;

import hu.ulyssys.java.course.javaee.demo.animal.dao.FarmerDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;
import hu.ulyssys.java.course.javaee.demo.animal.service.FarmerService;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class FarmerServiceImpl extends AbstractServiceImpl<Farmer> implements FarmerService {

    @Override
    public Farmer findByName(String name) {
        return ((FarmerDAO) dao).findByName(name);
    }
}


