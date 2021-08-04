package hu.ulyssys.java.course.maven.entity.entity;

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
