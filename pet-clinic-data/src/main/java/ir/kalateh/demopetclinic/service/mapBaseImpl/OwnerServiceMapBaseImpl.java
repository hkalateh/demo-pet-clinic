package ir.kalateh.demopetclinic.service.mapBaseImpl;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.service.OwnerService;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public class OwnerServiceMapBaseImpl extends AbstractMapBaseService<Owner> implements OwnerService {

    @Query("select o from Owner o where o.firstName=:name and o.lastName=:lastName")
    @Override
    public Owner findByNameAndLastName(String name, String lastName) {
        return new Owner();
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
