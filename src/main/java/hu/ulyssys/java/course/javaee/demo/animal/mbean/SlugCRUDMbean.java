package hu.ulyssys.java.course.javaee.demo.animal.mbean;


import hu.ulyssys.java.course.javaee.demo.animal.entity.Slug;
import hu.ulyssys.java.course.javaee.demo.animal.service.FarmerService;
import hu.ulyssys.java.course.javaee.demo.animal.service.SlugService;


import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@Named
@ViewScoped
public class SlugCRUDMbean extends FarmerAwareCRUDMBean<Slug> implements Serializable {


    @Inject
    public SlugCRUDMbean(SlugService slugService, FarmerService farmerService) {
        super(slugService, farmerService);

    }


    @Override
    protected String dialogName() {
        return "slugDialog";
    }

    @Override
    protected Slug initNewEntity() {
        return new Slug();
    }
}
