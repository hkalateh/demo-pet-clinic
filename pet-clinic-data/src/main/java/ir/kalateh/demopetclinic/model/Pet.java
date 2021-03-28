package ir.kalateh.demopetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
/*@Entity*/
public class Pet extends NamedEntity {

    @ManyToOne
    @JoinColumn(name = "type-id")
    private PetType type;
    private Date birthDate;
    
    @ManyToOne
    private Owner owner;
    
}
