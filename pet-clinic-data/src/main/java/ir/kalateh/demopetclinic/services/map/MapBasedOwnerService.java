package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.services.CommonInterface;

import java.util.Set;

public class MapBasedOwnerService extends AbstractMapService<Owner, Long> implements CommonInterface<Owner, Long> {
    
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
}
