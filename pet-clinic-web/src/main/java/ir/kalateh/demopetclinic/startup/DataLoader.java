package ir.kalateh.demopetclinic.startup;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.service.OwnerService;
import ir.kalateh.demopetclinic.service.PetService;
import ir.kalateh.demopetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final PetService petService;
    private final OwnerService ownerService;
    private final VetService vetService;
    
    public DataLoader(PetService petService, OwnerService ownerService, VetService vetService) {
        this.petService = petService;
        this.ownerService = ownerService;
        this.vetService = vetService;
    }
    
    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("hasan");
        owner.setLastName("ghasemi");
        owner.setAddress("tehran");
        owner.setTelephone("09127206084");
        owner.setCity("tehran");
        ownerService.save(owner);
        
        Owner owner1 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("ali");
        owner1.setLastName("zia");
        owner1.setAddress("shiraz");
        owner1.setTelephone("09124852696");
        owner1.setCity("shiraz");
        ownerService.save(owner1);
    
        Vet vet = new Vet();
        vet.setId(1L);
        vet.setFirstName("naser");
        vet.setLastName("khatar");
        vetService.save(vet);
    
        System.out.println("data is loaded....");
    
        System.out.println(ownerService.findById(2L));
    
        
    }
}
