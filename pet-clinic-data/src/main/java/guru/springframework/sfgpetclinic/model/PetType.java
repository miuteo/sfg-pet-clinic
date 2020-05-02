package guru.springframework.sfgpetclinic.model;


import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
public class PetType extends BaseEntity{
    private String name;

}
