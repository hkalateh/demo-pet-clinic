package ir.kalateh.demopetclinic.startup;

import ir.kalateh.demopetclinic.model.*;
import ir.kalateh.demopetclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DataLoader implements CommandLineRunner {
    
    private final VetService vetService;
    private final PetService petService;
    private final OwnerService ownerService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialityService;
    
    public DataLoader(VetService vetService, PetService petService, OwnerService ownerService, PetTypeService petTypeService, SpecialtyService specialityService) {
        this.vetService = vetService;
        this.petService = petService;
        this.ownerService = ownerService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }
    
    @Override
    public void run(String... args) throws Exception {
        
        int count = vetService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }
    
    private void loadData(){
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);
    
        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);
    
        System.out.println("#pet types : " + petTypeService.findAll().size());
    
        Owner owner1 = new Owner();
        owner1.setFirstName("salman");
        owner1.setLastName("basmechi");
        owner1.setCity("isfahan");
        owner1.setAddress("sq.imam");
        owner1.setTelephone("09123456789");
    
        Pet jimi = new Pet();
        jimi.setBirthDate(new Date());
        jimi.setOwner(owner1);
        jimi.setPetType(savedCatPetType);
        owner1.getPets().add(jimi);
    
        Pet gabby = new Pet();
        gabby.setBirthDate(new Date());
        gabby.setOwner(owner1);
        gabby.setPetType(savedDogPetType);
        owner1.getPets().add(gabby);
    
        ownerService.save(owner1);
    
        Owner owner = new Owner();
        owner.setFirstName("hossein");
        owner.setLastName("kalateh");
        owner.setTelephone("09123456789");
        owner.setAddress("sq.imam");
        owner.setCity("tehran");
    
        ownerService.save(owner);
    
        System.out.println("#owners : " + (long) ownerService.findAll().size());
    
        Speciality speciality = new Speciality();
        speciality.setDescription("radiology");
        speciality = specialityService.save(speciality);
    
        Vet vet = new Vet();
        vet.getSpecialities().add(speciality);
        vet.setFirstName("hasan");
        vet.setLastName("mirzayi");
    
        vetService.save(vet);
    
        Vet vet1 = new Vet();
        vet1.setFirstName("motahar");
        vet1.setLastName("maghsoudi");
    
        vetService.save(vet1);
    
        System.out.println("number of saved vets : " + (long) vetService.findAll().size());
    
        System.out.println("#vet's Specialities : " + vet.getSpecialities().size());
    }
}
