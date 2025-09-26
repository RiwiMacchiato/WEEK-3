import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student extends Person{

    String area;

    public Student(String name, String id, String area) {
        super(name, id);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Student(String name, String id) {
        super(name, id);
    }
}
