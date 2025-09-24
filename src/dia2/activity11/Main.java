package dia2.activity11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlyEmployee("Ana", "1", 160, 15));
        employees.add(new FullTimeEmployee("Luis", "2", 3000));
        employees.add(new FullTimeEmployee("Maria", "3", 3500));
        employees.add(new HourlyEmployee("Carlos", "4", 120, 20));

        for (Employee emp : employees) {
            System.out.println("ID del empleado: " + emp.getId());
            System.out.println("Nombre: " + emp.getName());
            
            if (emp instanceof Bonusable) {
                Bonusable bonusEmp = (Bonusable) emp;
                System.out.println("Salario mensual: $" + (emp.monthlySalary()+bonusEmp.bonus()));
            } else {
                System.out.println("Salario mensual: $" + emp.monthlySalary());
            }
            System.out.println("---------------------------");
        }



    }
}
