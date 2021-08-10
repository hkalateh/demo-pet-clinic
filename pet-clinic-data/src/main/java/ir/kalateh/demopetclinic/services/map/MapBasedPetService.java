package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Pet;
import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.services.CommonInterface;

import java.util.Set;

public class MapBasedPetService extends AbstractMapService<Pet,Long> implements CommonInterface<Pet,Long> {

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id,object);
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
