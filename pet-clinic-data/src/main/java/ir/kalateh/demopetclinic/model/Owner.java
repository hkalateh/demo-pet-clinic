package ir.kalateh.demopetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
/*@Entity*/
public class Owner extends Person {

    @NotNull
    @NotEmpty
    private String address;
    @NotNull
    @NotEmpty
    private String city;
    @NotNull
    @Digits(fraction = 0,integer = 11)
    @NotEmpty
    private String telephone;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();
}
