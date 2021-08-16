package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.services.VetService;

import java.util.Set;

public class MapBasedVetService extends AbstractMapService<Vet, Long> implements VetService {
    
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
    
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
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
