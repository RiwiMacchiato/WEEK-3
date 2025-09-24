package dia2.activity11;

public class FullTImeEmployee extends Employee implements Bonusable{
    private double baseSalary;

    

    public FullTImeEmployee(String id, String name, double baseSalary) {
        super(id, name);
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
