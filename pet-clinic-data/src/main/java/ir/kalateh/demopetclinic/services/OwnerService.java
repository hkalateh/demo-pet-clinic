package ir.kalateh.demopetclinic.services;

import ir.kalateh.demopetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    
    Owner findByName(String name);
    
    Owner findByNameAndLastName(String name, String family);
    
    Owner findById(Long id);
    
    Owner save(Owner owner);
    
    Set<Owner> findAll();
    
    void delete(Owner owner);
}
