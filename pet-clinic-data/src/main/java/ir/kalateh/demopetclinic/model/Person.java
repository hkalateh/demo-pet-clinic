package ir.kalateh.demopetclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
/*@MappedSuperclass*/
public class Person extends BaseEntity {
    
    @Column(name = "first_name")
    @NotNull
    @NotEmpty
    private String firstName;
    @Column(name = "last_name")
    @NotNull
    @NotEmpty
    private String lastName;
}
