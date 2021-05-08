package ir.kalateh.demopetclinic.service.mapBaseImpl;

import ir.kalateh.demopetclinic.model.Pet;
import ir.kalateh.demopetclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMapBaseImpl extends AbstractMapBaseService<Pet> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
