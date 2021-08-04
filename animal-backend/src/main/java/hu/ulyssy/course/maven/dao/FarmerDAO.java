package hu.ulyssy.course.maven.dao;

import hu.ulyssys.java.course.maven.entity.entity.Farmer;

public interface FarmerDAO extends CoreDAO<Farmer> {

    Farmer findByName(String name);
}