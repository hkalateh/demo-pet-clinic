package ir.kalateh.demopetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Person extends BaseEntity {
    private String firstName;
    private String lastName;
}
