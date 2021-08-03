package hu.ulyssys.java.course.javaee.demo.animal.service.impl;


import hu.ulyssys.java.course.javaee.demo.animal.dao.DogDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Dog;
import hu.ulyssys.java.course.javaee.demo.animal.service.DogService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
//extends AbstractService<Dog>

@ApplicationScoped
public class DogServiceImpl extends AbstractServiceImpl<Dog> implements DogService {

  /*  public DogServiceImpl() {

        for (int i = 0; i < 10; i++) {
            Dog dog = new Dog();
            dog.setId(Long.parseLong(Integer.toString(i + 20)));
            dog.setBarking("Vau-" + i);
            dog.setLegsNumb(5 + i);
            dog.setName("Kutja-" + i);
            dog.setType(dog.getAnimalType().toString());

            add(dog);
        }
    }

    @Override
    public void update(Dog currentDog) {

        //@Inject
        //DogServiceImpl példány;
        //példány.getAll() == getAll() !!!

        for (Dog dog : getAll()
        ) {
            if (dog.getId().equals(currentDog.getId())) {
                dog.setName(currentDog.getName());
                dog.setLegsNumb(currentDog.getLegsNumb());
                dog.setBarking(currentDog.getBarking());
            }
        }
    }*/
}
