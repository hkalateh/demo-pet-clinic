package ir.kalateh.demopetclinic.service.mapBaseImpl;

import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.service.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMapBaseImpl extends AbstractMapBaseService<Vet> implements VetService {
    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }


}
