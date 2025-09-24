package dia2.activity11;

public class HourlyEmployee extends Employee {

    private int hours;
    private double rate;

    public HourlyEmployee(String name, String id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double monthlySalary() {
        return hours * rate;
    }
}