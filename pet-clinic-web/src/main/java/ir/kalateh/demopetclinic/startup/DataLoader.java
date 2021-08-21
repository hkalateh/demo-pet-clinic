package ir.kalateh.demopetclinic.startup;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.services.OwnerService;
import ir.kalateh.demopetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final VetService vetService;
    private final OwnerService ownerService;
    
    public DataLoader(VetService vetService, OwnerService ownerService) {
        this.vetService = vetService;
        this.ownerService = ownerService;
    }
    
    @Override
    public void run(String... args) throws Exception {
    
        Owner owner1 = new Owner();
        owner1.setFirstName("salman");
        owner1.setLastName("basmechi");
        
        ownerService.save(owner1);
        
        Owner owner = new Owner();
        owner.setFirstName("hossein");
        owner.setLastName("kalateh");
        
        ownerService.save(owner);
    
        System.out.println("owners loaded....");
        System.out.println((long) ownerService.findAll().size());
    
        Vet vet = new Vet();
        vet.setFirstName("hasan");
        vet.setLastName("mirzayi");
        
        vetService.save(vet);
        
        Vet vet1 = new Vet();
        vet1.setFirstName("motahar");
        vet1.setLastName("maghsoudi");
        
        vetService.save(vet1);
    
        System.out.println("vets loaded...");
        System.out.println((long) vetService.findAll().size());
    }
}
