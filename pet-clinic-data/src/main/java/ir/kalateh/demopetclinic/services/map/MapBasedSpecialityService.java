package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Speciality;
import ir.kalateh.demopetclinic.services.SpecialtyService;

import java.util.Set;

public class MapBasedSpecialityService extends AbstractMapService<Speciality, Long> implements SpecialtyService {
    
    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
    
    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }
    
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }
    
    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }
    
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
