package hu.ulyssys.java.course.javaee.demo.animal.entity;

import javax.persistence.*;

@Entity
@Table(name = "cat")
public class Cat extends AbstractAnimal {

    @Column(name = "meow")
    private String meow;

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.CAT;
    }


}
