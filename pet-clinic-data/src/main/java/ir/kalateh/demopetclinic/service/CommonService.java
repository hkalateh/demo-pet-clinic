package ir.kalateh.demopetclinic.service;

import java.util.Set;

public interface CommonService<T> {

    T findById(Long id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(Long id);
}
