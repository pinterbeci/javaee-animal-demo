package hu.ulyssys.java.course.javaee.demo.animal.entity;


import javax.persistence.*;

@Entity
@Table(name = "dog2")
public class Dog extends AbstractAnimal {

    @Column(name = "barking")
    private String barking;

    public String getBarking() {
        return barking;
    }

    public void setBarking(String barking) {
        this.barking = barking;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.DOG;
    }

}
