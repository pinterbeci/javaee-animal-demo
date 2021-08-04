package hu.ulyssy.course.maven.service.impl;


import hu.ulyssys.java.course.maven.entity.entity.Dog;
import hu.ulyssys.java.course.maven.entity.service.DogService;

import javax.ejb.Stateless;
//extends AbstractService<Dog>

@Stateless
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
