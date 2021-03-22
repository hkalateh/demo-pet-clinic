package ir.kalateh.demopetclinic.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@ToString
@MappedSuperclass
public class NamedEntity extends BaseEntity {

    public String name;
}
