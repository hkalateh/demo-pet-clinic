package ir.kalateh.demopetclinic.services;

import ir.kalateh.demopetclinic.model.Vet;

import java.util.Set;

public interface VetService extends CommonInterface<Vet,Long> {

    Vet findByName(String name);
}
