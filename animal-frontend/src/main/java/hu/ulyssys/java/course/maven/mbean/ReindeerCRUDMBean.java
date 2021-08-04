package hu.ulyssys.java.course.maven.mbean;


import hu.ulyssys.java.course.maven.entity.entity.Reindeer;
import hu.ulyssys.java.course.maven.entity.service.CoreService;
import hu.ulyssys.java.course.maven.entity.service.FarmerService;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class ReindeerCRUDMBean extends FarmerAwareCRUDMBean<Reindeer> implements Serializable {


    @Inject
    public ReindeerCRUDMBean(CoreService<Reindeer> service, FarmerService farmerService) {
        super(service, farmerService);
    }

    @Override
    protected String dialogName() {
        return "reindeerDialog";
    }

    @Override
    protected Reindeer initNewEntity() {
        return new Reindeer();
    }
}
