package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Speciality extends BaseEntity{

    @ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets = new HashSet<>();
    private String description;

}
