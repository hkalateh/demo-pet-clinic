package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.services.CommonInterface;

import java.util.Set;

public class MapBasedVetService extends AbstractMapService<Vet,Long> implements CommonInterface<Vet,Long> {

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id,object);
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
}
