package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService extends AbstractSDJpaService<Speciality,Long> implements SpecialityService {

    public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
        super(specialityRepository);
    }

}
