import java.util.ArrayList;
import models.Employee;
import models.FullTimeEmployee;
import models.HourlyEmployee;
import models.Bonusable;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Employee> employees = new ArrayList<>();

        // Add different types of employees
        employees.add(new FullTimeEmployee("001", "John Doe", 5000));
        employees.add(new FullTimeEmployee("002", "Jane Smith", 6000));
        employees.add(new HourlyEmployee("003", "Bob Johnson", 160, 25));
        employees.add(new HourlyEmployee("004", "Alice Brown", 120, 30));

        double totalSalaries = 0;

        System.out.println("Employee Salary Report:");
        System.out.println("========================");

        for (Employee employee : employees) {
            double salary = employee.monthlySalary();
            double bonus = 0;

            System.out.print(employee.getName() + " (" + employee.getId() + "): $" + salary);

            if (employee instanceof Bonusable) {
                bonus = ((Bonusable) employee).bonus();
                System.out.print(" + Bonus: $" + bonus);
            }

            System.out.println(" = Total: $" + (salary + bonus));
            totalSalaries += salary + bonus;
        }

        System.out.println("========================");
        System.out.println("Total Monthly Cost: $" + totalSalaries);
    }
}
