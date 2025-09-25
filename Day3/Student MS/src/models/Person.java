package src.models;

public abstract class Person {
    protected String id;
    protected String name;
    protected int age;
    
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    // Getter methods
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    // Setter methods
    public void setId(String id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Abstract method that must be implemented by subclasses
    public abstract String getRole();
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Role: " + getRole();
    }
}