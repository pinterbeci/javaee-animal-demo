package hu.ulyssys.java.course.javaee.demo.animal.mbean;


import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;
import hu.ulyssys.java.course.javaee.demo.animal.service.FarmerService;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class FarmerCRUDMBean extends CoreCRUDMBean<Farmer> implements Serializable {

    @Inject
    public FarmerCRUDMBean(FarmerService farmerService) {
        super(farmerService);
    }

    @Override
    protected String dialogName() {
        return "farmerDialog";
    }

    @Override
    protected Farmer initNewEntity() {
        return new Farmer();
    }
}
