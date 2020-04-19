package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Owner findByLastName(String lastName) {
        return map.entrySet()
                .stream().map(Map.Entry::getValue)
                .filter(e -> e.getFirstName().equals(lastName))
                .findAny().orElse(null);
    }

    @Override
    public Owner save(Owner owner){
        return super.save(owner.getId(),owner);
    }
}
