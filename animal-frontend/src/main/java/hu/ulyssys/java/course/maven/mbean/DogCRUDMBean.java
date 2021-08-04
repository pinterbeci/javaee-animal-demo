package hu.ulyssys.java.course.maven.mbean;

import hu.ulyssys.java.course.maven.entity.entity.Dog;
import hu.ulyssys.java.course.maven.entity.service.DogService;
import hu.ulyssys.java.course.maven.entity.service.FarmerService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class DogCRUDMBean extends FarmerAwareCRUDMBean<Dog> implements Serializable {


    @Inject
    public DogCRUDMBean(DogService dogService, FarmerService farmerService) {
        super(dogService, farmerService);
    }


    @Override
    protected String dialogName() {
        return "dogDialog";
    }

    @Override
    protected Dog initNewEntity() {
        return new Dog();
    }
}
