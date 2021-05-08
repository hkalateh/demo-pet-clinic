package ir.kalateh.demopetclinic.service.mapBaseImpl;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.service.OwnerService;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMapBaseImpl extends AbstractMapBaseService<Owner> implements OwnerService {

    @Query("select o from Owner o where o.firstName=:name and o.lastName=:family")
    @Override
    public Owner findByNameAndLastName(@Param("name") String name, @Param("family") String lastName) {
        return new Owner();
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
