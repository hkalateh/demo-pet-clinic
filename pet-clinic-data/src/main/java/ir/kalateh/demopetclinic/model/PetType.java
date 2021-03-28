package ir.kalateh.demopetclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@Data
/*@Entity*/
public class PetType extends NamedEntity {
}
