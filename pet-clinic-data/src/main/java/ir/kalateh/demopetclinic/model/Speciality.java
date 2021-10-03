package ir.kalateh.demopetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
@Getter
@Setter
public class Speciality extends BaseEntity {
    
    /*@ManyToMany(mappedBy = "specialities")
    private Set<Vet> vets;*/
    
    private String description;
}
