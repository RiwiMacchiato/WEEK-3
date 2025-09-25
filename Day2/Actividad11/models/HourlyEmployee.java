package models;

public class HourlyEmployee extends Employee {
    private int hours;
    private double rate;

    public HourlyEmployee(String id, String name, int hours, double rate) {
        super(id, name);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    public double monthlySalary() {
        return hours * rate;
    }
}
