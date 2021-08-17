package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedOwnerService extends AbstractMapService<Owner, Long> implements OwnerService {
    
    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
    
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
    
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }
    
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
    
    @Override
    public Owner findByName(String name) {
        return null;
    }
    
    @Override
    public Owner findByNameAndLastName(String name, String family) {
        return null;
    }
}
