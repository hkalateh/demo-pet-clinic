package ir.kalateh.demopetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Pet extends BaseEntity {
    @ManyToOne
    private Owner owner;
    @OneToOne
    private PetType petType;
    private Date birthDate;
}
