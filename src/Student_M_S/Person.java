package Student_M_S;

public abstract class Person {

    protected int ced;
    protected String name;

    Person (int ced, String name) {
        this.ced=ced;
        this.name= name;
    }

    public abstract String getDescripcion();

    public int getCed() {
        return ced;
    }

    public void setCed(int ced) {
        this.ced= ced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ced=" + ced +
                ", name='" + name + '\'' +
                '}';
    }
}
