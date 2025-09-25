package Day2.Activity11;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("E001", "Carlos", 3000));
        employees.add(new FullTimeEmployee("E002", "Andrea", 2500));
        employees.add(new HourlyEmployee(15, 2500, "e02", "Juan"));
        employees.add(new HourlyEmployee(10, 1300, "e08", "Jorgue"));

        double total = 0;

        for (Employee e : employees) {
            double salary= e.monthlySalary();
            double bonus= 0;

            if (e instanceof Bonusable) {
                bonus = ((Bonusable) e).bonus();
            }

            total += salary + bonus;

            System.out.println(e.getName() + " gana $" + salary +
                    " + bono $" + bonus +
                    " = $" + (salary + bonus));
        }

        System.out.println("\nTotal a pagar a todos los empleados: $" + total);

        }
    }

