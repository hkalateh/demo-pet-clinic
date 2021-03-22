package ir.kalateh.demopetclinic.service;

import ir.kalateh.demopetclinic.model.Vet;

import java.util.Set;

public interface vetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
