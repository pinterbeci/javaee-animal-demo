package hu.ulyssys.java.course.maven.mbean;


import hu.ulyssys.java.course.maven.entity.entity.Farmer;
import hu.ulyssys.java.course.maven.entity.service.FarmerService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

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
