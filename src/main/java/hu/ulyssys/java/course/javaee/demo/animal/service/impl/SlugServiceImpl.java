package hu.ulyssys.java.course.javaee.demo.animal.service.impl;

import hu.ulyssys.java.course.javaee.demo.animal.dao.SlugDAO;
import hu.ulyssys.java.course.javaee.demo.animal.entity.Slug;
import hu.ulyssys.java.course.javaee.demo.animal.service.SlugService;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

//extends AbstractService<Slug>

@ApplicationScoped
public class SlugServiceImpl extends AbstractServiceImpl<Slug> implements SlugService {


   /* public SlugServiceImpl() {
        for (int i = 0; i < 10; i++) {
            Slug slug = new Slug();
            slug.setSpeed(5 + i);
            slug.setType(slug.getAnimalType().toString());
            slug.setLegsNumb(4 + i);
            slug.setId(Long.parseLong(i + 10 + ""));
            slug.setName("Tsigaaa-" + i);
            add(slug);
        }
    }

    @Override
    public void update(Slug currentSlug) {

        for (Slug slug: getAll()
             ) {
            if( slug.getId().equals(currentSlug.getId())){
                slug.setName(currentSlug.getName());
                slug.setLegsNumb(currentSlug.getLegsNumb());
                slug.setSpeed(currentSlug.getSpeed());
            }
        }
    }*/
}
