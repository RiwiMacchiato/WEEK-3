package Student_M_S;

import java.awt.*;
import java.util.ArrayList;

public interface Repository<T> {

    void save(T t);

    T seachId(String id);

    void delete(String id);

    ArrayList<T> findAll();

}