package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Pet;
import ir.kalateh.demopetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedPetService extends AbstractMapService<Pet, Long> implements PetService {
    
    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
    
    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }
    
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }
    
    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
    
    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
