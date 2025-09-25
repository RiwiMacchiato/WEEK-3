package dia2.activity7;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, User> users = new HashMap<>();

        User user1 = new User("1", "Johan");
        User user2 = new User("2", "Maria");
        User user3 = new User("3", "Carlos");

        // storing users
        users.put(user1.key(), user1);
        users.put(user2.key(), user2);
        users.put(user3.key(), user3);

        System.out.println("Usuarios en el sistema:");
        for (User user : users.values()) {
            System.out.println(user);
        }

        // seaching for a user
        String searchId = "2";
        User foundUser = users.get(searchId);
        if (foundUser != null) {
            System.out.println("\nUsuario encontrado: " + foundUser);
        } else {
            System.out.println("\nUsuario no encontrado.");
        }

        // updating a user
        User userToUpdate = users.get("3");
        if (userToUpdate != null) {
            userToUpdate.setName("Pedro");
            System.out.println("\nUsuario actualizado: " + userToUpdate);
        } else {
            System.out.println("\nUsuario no encontrado para actualizar.");
        }

        // removing a user
        User removedUser = users.remove("1");
        if (removedUser != null) {
            System.out.println("\nUsuario eliminado: " + removedUser);
        } else {
            System.out.println("\nUsuario no encontrado para eliminar.");
        }

        System.out.println("\nUsuarios restantes en el sistema:");
        for (User user : users.values()) {
            System.out.println(user);
        }

    }
}
