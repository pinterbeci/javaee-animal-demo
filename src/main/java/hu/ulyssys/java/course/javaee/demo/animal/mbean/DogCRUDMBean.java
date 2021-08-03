package hu.ulyssys.java.course.javaee.demo.animal.mbean;

import hu.ulyssys.java.course.javaee.demo.animal.entity.Dog;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;
import hu.ulyssys.java.course.javaee.demo.animal.service.DogService;
import hu.ulyssys.java.course.javaee.demo.animal.service.FarmerService;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

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
