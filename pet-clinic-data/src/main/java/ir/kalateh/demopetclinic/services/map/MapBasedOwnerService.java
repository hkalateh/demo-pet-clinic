package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedOwnerService extends AbstractMapService<Owner, Long> implements OwnerService {
    
    @Override
    public Owner findByName(String name) {
        return null;
    }
    
    @Override
    public Owner findByNameAndLastName(String name, String family) {
        return null;
    }
}
