package Day2.Activity11;

public class HourlyEmployee extends Employee {
    private double hour;
    private double rate;

    public HourlyEmployee(double hour, double rate, String id, String name) {
        super(id, name);
        this.hour = hour;
        this.rate = rate;
    }

    @Override
    public double monthlySalary() {
        return hour * rate;
    }
}
