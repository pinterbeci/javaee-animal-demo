package hu.ulyssys.java.course.javaee.demo.animal.dao;

import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;

import java.util.List;

public interface FarmerDAO extends CoreDAO<Farmer> {

    Farmer findByName(String name);
}