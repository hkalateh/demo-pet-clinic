package ir.kalateh.demopetclinic.services;

import ir.kalateh.demopetclinic.model.Pet;

import java.util.Set;

public interface CommonInterface<T,ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
