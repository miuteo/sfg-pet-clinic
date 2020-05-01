package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService extends AbstractSDJpaService<Visit,Long>{

    public VisitSDJpaService(VisitRepository visitRepository) {
        super(visitRepository);
    }
}
