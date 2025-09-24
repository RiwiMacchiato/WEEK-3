package dia2.activity13;

import java.util.HashMap;

public interface Repo<T>{
    HashMap<String, T> findAll();
    void save(T t);
    T findById(String id);
    void delete(String id);
}
