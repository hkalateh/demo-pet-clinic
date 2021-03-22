package ir.kalateh.demopetclinic.service;

import ir.kalateh.demopetclinic.model.Owner;

import java.util.Set;

public interface ownerService {

    Owner findByNameAndLastName(String name, String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
