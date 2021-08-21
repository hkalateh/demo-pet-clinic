package ir.kalateh.demopetclinic.services.map;

import ir.kalateh.demopetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID> {
    
    protected Map<Long, T> map = new HashMap<>();
    
    T findById(ID id) {
        return map.get(id);
    }
    
    Set<T> findAll() {
        return new HashSet<>(map.values());
    }
    
    T save(T object){
        
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
    
    void deleteById(ID id) {
        map.remove(id);
    }
    
    void delete(T object) {
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
