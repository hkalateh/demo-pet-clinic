package ir.kalateh.demopetclinic.service;

import ir.kalateh.demopetclinic.model.Pet;

import java.util.Set;

public interface petService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
