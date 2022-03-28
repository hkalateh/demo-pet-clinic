package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.Speciality;
import ir.kalateh.demopetclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MapBasedSpecialityService extends AbstractMapService<Speciality, Long> implements SpecialtyService {

}
