package ir.kalateh.demopetclinic.services;

import ir.kalateh.demopetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    
    Vet findById(Long id);
    
    Vet save(Vet vet);
    
    Set<Vet> findAll();
    
    void delete(Vet vet);
}
