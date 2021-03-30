package ir.kalateh.demopetclinic.service.mapBaseImpl;

import ir.kalateh.demopetclinic.service.CommonService;
import org.springframework.data.repository.CrudRepository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public abstract class AbstractMapBaseService<T> implements CommonService<T> {

    HashMap<Long, T> map = new HashMap();

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(Long id) {
        return map.get(id);
    }

    public T save(Long id, T object) {
        map.put(id, object);
        return object;
    }

    public void deleteById(Long id) {
        map.remove(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }
}
