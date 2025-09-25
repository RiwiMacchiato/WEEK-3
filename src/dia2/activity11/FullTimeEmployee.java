package dia2.activity11;

public class FullTimeEmployee extends Employee implements Bonusable{
    private double baseSalary;

    

    public FullTimeEmployee(String name, String id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    @Override
    public double bonus() {
        return baseSalary*0.1;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double monthlySalary() {
        return baseSalary;
    }
    
    
}
