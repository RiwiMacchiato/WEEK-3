package Student_M_S;

public class Student extends Person{

    private String major;
    private String id;

    public Student(int ced, String name,String major, String id ) {
        super(ced, name);
        this.major= major;
        this.id= id;

    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getDescripcion() {

        return "Student: " + name + ",Cedula: " + ced + ",ID: "+ id + ",Mayor?: " + major;


    }
}
