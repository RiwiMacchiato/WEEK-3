package dia2.activity13;

import java.util.HashMap;

public class StudentRepo implements Repo<Student>{
    HashMap<String, Student> students = new HashMap<>();

    @Override
    public void save(Student t) {
        students.put(t.getId(), t);
    }

    @Override
    public Student findById(String id) {
        return students.get(id);
    }

    @Override
    public void delete(String id) {
        students.remove(id);
    }

    @Override
    public HashMap<String, Student> findAll() {
        return students;
    }
    
    
}
