package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.services.SpecialtyService;
import ir.kalateh.demopetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedVetService extends AbstractMapService<Vet, Long> implements VetService {
    
    private final SpecialtyService specialtyService;
    
    public MapBasedVetService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }
    
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
    
    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities() != null) {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    specialtyService.save(speciality);
                }
            });
        }
        return super.save(object);
    }
    
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
    
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
    
    @Override
    public Vet findByName(String name) {
        return null;
    }
}
