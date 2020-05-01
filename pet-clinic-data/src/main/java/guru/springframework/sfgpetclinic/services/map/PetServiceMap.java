package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    private final VisitService visitService;

    public PetServiceMap(VisitService visitService) {
        this.visitService = visitService;
    }

    @Override
    public Pet save(Pet pet){
        if(pet!=null){
            if(pet.getVisit()!=null){
                pet.getVisit().forEach(visitService::save);
            }
            return super.save(pet);
        }else{
            return null;
        }
    }
}
