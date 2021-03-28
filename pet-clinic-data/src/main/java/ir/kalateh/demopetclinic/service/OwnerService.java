package ir.kalateh.demopetclinic.service;

import ir.kalateh.demopetclinic.model.Owner;

public interface OwnerService extends CommonService<Owner> {

    Owner findByNameAndLastName(String name, String lastName);
}
