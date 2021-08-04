package hu.ulyssy.course.maven.service.impl;


import hu.ulyssy.course.maven.dao.FarmerDAO;
import hu.ulyssys.java.course.maven.entity.entity.Farmer;
import hu.ulyssys.java.course.maven.entity.service.FarmerService;

import javax.ejb.Stateless;

@Stateless
public class FarmerServiceImpl extends AbstractServiceImpl<Farmer> implements FarmerService {

    @Override
    public Farmer findByName(String name) {
        return ((FarmerDAO) dao).findByName(name);
    }
}


