package Student_M_S;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentRepository implements Repository<Student>{


    private HashMap<String, Student> HapStudent = new HashMap<>();


    @Override
    public void save(Student student) {
        HapStudent.put(student.getId(),student);
    }

    @Override
    public Student seachId(String id) {
        return HapStudent.get(id);
    }

    @Override
    public void delete(String id) {
        HapStudent.remove(id);
    }

    @Override
    public ArrayList<Student> findAll() {
        ArrayList<Student> students = new ArrayList<>();
        HapStudent.forEach((k,v)->{
            students.add(v);
        });
        return students;


    }
}
