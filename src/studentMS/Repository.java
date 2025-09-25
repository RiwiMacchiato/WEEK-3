package studentMS;

import java.util.ArrayList;

public interface Repository<T> {
    ArrayList<T> findAll();
    void save(T t);
    T findById(int id);
    void delete(int id);
}
