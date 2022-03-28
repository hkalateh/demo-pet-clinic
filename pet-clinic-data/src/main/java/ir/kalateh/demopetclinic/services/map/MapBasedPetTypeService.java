package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.PetType;
import ir.kalateh.demopetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedPetTypeService extends AbstractMapService<PetType, Long> implements PetTypeService {

}
