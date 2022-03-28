package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Pet;
import ir.kalateh.demopetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedPetService extends AbstractMapService<Pet, Long> implements PetService {

}
