package Exercises.Activity_7;

import java.util.HashMap;

public class Activity7  {

    static void main() {

        HashMap<String, User> users = new HashMap<>();

        User u1 = new User("00","Carlos");
        User u2 = new User("01","Andres");
        users.put(u1.key(), u1);
        users.put(u2.key(), u2);

        System.out.println("usuarios:");
        System.out.println(users);


        users.get("00").setName("Altrufio");
        System.out.println("Actualizacion de usuario:" + users.get("00"));

        users.remove("01");
        System.out.println("usuario eliminado" + users);





    }


}
