package src.models;

public class Student extends Person {
    private String major;
    private double gpa;
    private int semester;
    
    public Student(String id, String name, int age, String major, double gpa, int semester) {
        super(id, name, age);
        this.major = major;
        this.gpa = gpa;
        this.semester = semester;
    }
    
    // Getter methods for student-specific attributes
    public String getMajor() {
        return major;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public int getSemester() {
        return semester;
    }
    
    // Setter methods for student-specific attributes
    public void setMajor(String major) {
        this.major = major;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    // Override the abstract method from Person
    @Override
    public String getRole() {
        return "Student";
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", GPA: " + String.format("%.2f", gpa) + ", Semester: " + semester;
    }
}