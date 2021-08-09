package ir.kalateh.demopetclinic.services;

import ir.kalateh.demopetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    
    PetService findById(Long id);
    
    Pet save(Pet pet);
    
    Set<Pet> findAll();
    
    void delete(Pet pet);
}
