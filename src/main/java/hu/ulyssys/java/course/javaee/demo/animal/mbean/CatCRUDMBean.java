package hu.ulyssys.java.course.javaee.demo.animal.mbean;

import hu.ulyssys.java.course.javaee.demo.animal.entity.Cat;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;
import hu.ulyssys.java.course.javaee.demo.animal.service.CatService;
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
public class CatCRUDMBean extends FarmerAwareCRUDMBean<Cat> implements Serializable {

    @Inject
    public CatCRUDMBean(CatService catService, FarmerService farmerService) {
        super(catService, farmerService);
    }

    @Override
    protected String dialogName() {
        return "catDialog";
    }

    @Override
    protected Cat initNewEntity() {
        return new Cat();
    }
}
