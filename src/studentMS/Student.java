package studentMS;

public class Student extends Person{
    private int studentId;

    public Student(String name, int id, int studentId) {
        super(name, id);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
