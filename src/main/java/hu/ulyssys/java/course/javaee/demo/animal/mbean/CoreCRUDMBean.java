package hu.ulyssys.java.course.javaee.demo.animal.mbean;

import hu.ulyssys.java.course.javaee.demo.animal.entity.AbstractEntity;
import hu.ulyssys.java.course.javaee.demo.animal.service.CoreService;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

public abstract class CoreCRUDMBean<T extends AbstractEntity> implements Serializable {
    private List<T> list;
    private T selectedEntity;

    protected CoreService<T> service;

    public CoreCRUDMBean(CoreService<T> service) {
        this.service = service;
        setSelectedEntity(initNewEntity());
        setList(service.getAll());
    }

    public void initSave() {
        selectedEntity = initNewEntity();
    }

    public void save() {
        if (selectedEntity.getId() == null) {
            service.add(selectedEntity);
            list = service.getAll();
            selectedEntity = initNewEntity();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sikeres mentés"));

        } else {
            service.update(selectedEntity);
            list = service.getAll();
            selectedEntity = initNewEntity();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sikeres módosítás"));
        }
        PrimeFaces.current().executeScript("PF('" + dialogName() + "').hide()");
    }


    public void remove() {
        service.remove(selectedEntity);
        list = service.getAll();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sikeres törlés"));

    }

    protected abstract String dialogName();

    protected abstract T initNewEntity();

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getSelectedEntity() {
        return selectedEntity;
    }

    public void setSelectedEntity(T selectedEntity) {
        this.selectedEntity = selectedEntity;
    }
}
