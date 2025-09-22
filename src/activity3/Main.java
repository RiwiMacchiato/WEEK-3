package activity3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        Agenda myAgenda = new Agenda();
        myAgenda.getAgenda().put("Johan","123456789");
        myAgenda.getAgenda().put("Andres","987654321");
        myAgenda.getAgenda().put("Felipe","159736842");

        for(var contact: myAgenda.getAgenda().entrySet()){
            if(contact.getKey().equals("Andres")){
                System.out.println("Nombre: " + contact.getKey() + "\nTelefono: " + contact.getValue());
            }
        }
    }
}
