package hu.ulyssys.java.course.maven.entity.entity;

import javax.persistence.*;

@Entity
@Table(name = "slug")
public class Slug extends AbstractAnimal {

    @Column(name = "speed")
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.SLUG;
    }

}
