package ir.kalateh.demopetclinic.model;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {
    private Long id;
}
