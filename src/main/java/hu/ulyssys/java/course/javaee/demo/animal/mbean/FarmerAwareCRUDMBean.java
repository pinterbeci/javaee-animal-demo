package hu.ulyssys.java.course.javaee.demo.animal.mbean;

import hu.ulyssys.java.course.javaee.demo.animal.entity.AbstractAnimal;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Farmer;
import hu.ulyssys.java.course.javaee.demo.animal.service.CoreService;
import hu.ulyssys.java.course.javaee.demo.animal.service.FarmerService;

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
