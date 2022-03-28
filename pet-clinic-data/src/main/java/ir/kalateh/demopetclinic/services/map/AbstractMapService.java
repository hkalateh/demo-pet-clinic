package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.BaseEntity;
import ir.kalateh.demopetclinic.services.CommonInterface;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID> implements CommonInterface<T, ID> {
    
    protected Map<Long, T> map = new HashMap<>();

    @Override
    public T findById(ID id) {
        return map.get(id);
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public T save(T object){
        
        if(object != null) {
            if(object.getId() == null){
                object.setId(getNextId());
            }
            
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    @Override
    public void deleteById(ID id) {
        map.remove(id);
    }

    @Override
    public void delete(T object) {
        map.entrySet().removeIf(t -> t.getValue().equals(object));
    }
    
    public Long getNextId() {
        Long next = null;
        try {
            next = Collections.max(map.keySet()) + 1L;
        } catch (Exception e) {
            next = 1L;
        }
        return next;
    }
}
