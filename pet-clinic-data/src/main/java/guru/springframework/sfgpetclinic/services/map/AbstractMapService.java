package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    protected Map<Long, T> map = new HashMap<>();

    public Set<T> findAll() {
        return new HashSet(map.values());
    }

    public T findById(Long id){
        return map.get(id);
    }

    public T save(T t){
        if(t!=null){
            if(t.getId()==null){
                t.setId(getNextId());
            }
            map.put( t.getId(),t);
        }
        else
            throw new RuntimeException("cannot save null object");
        return t;
    }

    public void deleteById(Long id){
        map.remove(id);
    }

    public void delete(T t){
        map.entrySet().removeIf(entry -> entry.equals(t));
    }

    private Long getNextId(){
        if(map.isEmpty()){
            return 1L;
        }
        return Collections.max(map.keySet())+1;
    }
}
