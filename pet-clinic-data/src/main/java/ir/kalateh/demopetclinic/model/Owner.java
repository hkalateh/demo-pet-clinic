package ir.kalateh.demopetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Getter
@Setter
@Entity
public class Owner extends Person {
    
    @NotEmpty
    private String city;
    
    @NotEmpty
    private String address;
    
    @NotEmpty
    @Digits(fraction = 0, integer = 11)
    private String telephone;
    
    @OneToMany(mappedBy = "owner")
    private Set<Pet> pets;
}
