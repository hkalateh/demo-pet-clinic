package ir.kalateh.demopetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
/*@Entity*/
public class Pet extends NamedEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type-id")
    private PetType type;
    private Date birthDate;
    
    @ManyToOne
    @JoinColumn(name = "owner-id")
    private Owner owner;
    
}
