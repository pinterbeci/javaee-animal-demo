package hu.ulyssys.java.course.maven.entity.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "reindeer")
public class Reindeer extends AbstractAnimal{

    @Column(name = "count_of_horns")
    private int countOfHorns ;


    @Override
    public AnimalType getAnimalType() {
        return AnimalType.REINDEER;
    }

    public int getCountOfHorns() {
        return countOfHorns;
    }

    public void setCountOfHorns(int countOfHorns) {
        this.countOfHorns = countOfHorns;
    }
}
