package hu.ulyssys.java.course.maven.entity.service;

import hu.ulyssys.java.course.maven.entity.entity.Farmer;

public interface FarmerService extends CoreService<Farmer>{

    Farmer findByName(String name);
}
