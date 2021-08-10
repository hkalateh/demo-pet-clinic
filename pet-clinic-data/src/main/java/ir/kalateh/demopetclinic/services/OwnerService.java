package ir.kalateh.demopetclinic.services;

import ir.kalateh.demopetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CommonInterface<Owner,Long> {
    
    Owner findByName(String name);
    
    Owner findByNameAndLastName(String name, String family);
}
