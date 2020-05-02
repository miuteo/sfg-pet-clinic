package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Vet extends Person{
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vets_specialiesX",
            joinColumns = @JoinColumn(name="vet_idX"),
            inverseJoinColumns = @JoinColumn(name="spec_id_X"))
    private Set<Speciality> specialities = new HashSet<>();

}
