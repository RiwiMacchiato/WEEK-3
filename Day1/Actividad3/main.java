import models.Agenda;
import java.util.HashMap;

public class main {
    public static void main(String[] args)  {   
        Agenda agenda = new Agenda();

        agenda.getAgenda().put("Juan", "123-456-7890");
        agenda.getAgenda().put("Ana", "987-654-3210");
        agenda.getAgenda().put("David", "555-555-5555");


        agenda.getAgenda().forEach((name, phone) -> {
            if(name.equals("Ana")){
                System.out.println("Name: " + name + ", Phone: " + phone);
            }
        });
    }
}