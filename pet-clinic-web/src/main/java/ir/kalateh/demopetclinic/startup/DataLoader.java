package ir.kalateh.demopetclinic.startup;

import ir.kalateh.demopetclinic.model.Owner;
import ir.kalateh.demopetclinic.model.Vet;
import ir.kalateh.demopetclinic.services.OwnerService;
import ir.kalateh.demopetclinic.services.VetService;
import ir.kalateh.demopetclinic.services.map.MapBasedOwnerService;
import ir.kalateh.demopetclinic.services.map.MapBasedVetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    
    private VetService vetService;
    private OwnerService ownerService;
    
    public DataLoader() {
        vetService = new MapBasedVetService();
        ownerService = new MapBasedOwnerService();
    }
    
    @Override
    public void run(String... args) throws Exception {
    
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("salman");
        owner1.setLastName("basmechi");
        
        ownerService.save(owner1);
        
        Owner owner = new Owner();
        owner.setId(2L);
        owner.setFirstName("hossein");
        owner.setLastName("kalateh");
        
        ownerService.save(owner);
    
        System.out.println("owners loaded....");
        System.out.println((long) ownerService.findAll().size());
    
        Vet vet = new Vet();
        vet.setFirstName("hasan");
        vet.setLastName("mirzayi");
        vet.setId(1L);
        
        vetService.save(vet);
        
        Vet vet1 = new Vet();
        vet1.setFirstName("motahar");
        vet1.setLastName("maghsoudi");
        vet1.setId(2L);
        
        vetService.save(vet1);
    
        System.out.println("vets loaded...");
        System.out.println((long) vetService.findAll().size());
    }
}
