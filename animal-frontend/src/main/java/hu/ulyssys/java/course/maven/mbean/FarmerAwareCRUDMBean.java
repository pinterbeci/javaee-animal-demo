package hu.ulyssys.java.course.maven.mbean;

import hu.ulyssys.java.course.maven.entity.entity.AbstractAnimal;
import hu.ulyssys.java.course.maven.entity.entity.Farmer;
import hu.ulyssys.java.course.maven.entity.service.CoreService;
import hu.ulyssys.java.course.maven.entity.service.FarmerService;

import java.util.List;

public abstract class FarmerAwareCRUDMBean<T extends AbstractAnimal> extends CoreCRUDMBean<T> {
    private List<Farmer> farmerList;

    public FarmerAwareCRUDMBean(CoreService<T> service, FarmerService farmerService) {
        super(service);
        farmerList = farmerService.getAll();
    }


    public List<Farmer> getFarmerList() {
        return farmerList;
    }

    public void setFarmerList(List<Farmer> farmerList) {
        this.farmerList = farmerList;
    }
}
