package hu.ulyssys.java.course.javaee.demo.animal.service;

import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;

import java.util.List;

public interface FarmerService extends CoreService<Farmer>{

    Farmer findByName(String name);
}
