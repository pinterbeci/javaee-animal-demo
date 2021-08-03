package hu.ulyssys.java.course.javaee.demo.animal.service.impl;

import hu.ulyssys.java.course.javaee.demo.animal.dao.CatDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Cat;
import hu.ulyssys.java.course.javaee.demo.animal.service.CatService;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

//extends AbstractService<Cat>

@ApplicationScoped
public class CatServiceImpl extends AbstractServiceImpl<Cat> implements CatService {


    /*public CatServiceImpl() {

        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cat.setMeow("Mijauu-" + i);
            cat.setLegsNumb(i + 2);
            cat.setId(Long.parseLong(i+""));
            cat.setName("Macska-" + i);
            cat.setType(cat.getAnimalType().toString());
            add(cat);
        }
    }


    @Override
    public void update(Cat currentCat) {

        for (Cat cat: getAll()
             ) {
            if( cat.getId().equals(currentCat.getId()) ){

               // cat.setId(System.currentTimeMillis());
                cat.setName(currentCat.getName());
                cat.setLegsNumb(currentCat.getLegsNumb());
                cat.setType(currentCat.getAnimalType().toString());
                cat.setMeow(currentCat.getMeow());
            }
        }
    }*/
}
