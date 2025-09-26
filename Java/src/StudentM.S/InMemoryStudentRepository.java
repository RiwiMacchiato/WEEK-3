import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryStudentRepository implements Crud {

    private Map<String, Student> memory = new HashMap<>();

    @Override
    public void crete(Student student) {
        memory.put(student.getId(),student);
    }

    @Override
    public Student findId(String id) {
        return memory.get(id);
    }

    @Override
    public void delete(String id) {
        memory.remove(id);
    }

    @Override
    public List<Student> showAll() {
        return new ArrayList<>(memory.values());
    }
}
