import java.util.HashMap;
import java.util.List;

public interface Crud {



    void crete(Student student);

    Student findId(String id);

    void delete(String id);

    List<Student> showAll();

}
