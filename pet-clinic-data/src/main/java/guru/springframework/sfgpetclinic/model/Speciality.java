package guru.springframework.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Speciality extends BaseEntity{

    @ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets = new HashSet<>();
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
