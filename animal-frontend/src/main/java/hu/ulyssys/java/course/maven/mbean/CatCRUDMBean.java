package hu.ulyssys.java.course.maven.mbean;

import hu.ulyssys.java.course.maven.entity.entity.Cat;
import hu.ulyssys.java.course.maven.entity.service.CatService;
import hu.ulyssys.java.course.maven.entity.service.FarmerService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

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
