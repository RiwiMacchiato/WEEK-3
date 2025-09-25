
import java.util.HashMap;
import models.User;

public class Main {
    public static void main(String[] args) throws Exception {
        HashMap<String,User> users = new HashMap<>();
        User u1 = new User("1", "Juan");
        User u2 = new User("2", "Ana");

        users.put(u1.key(), u1);

        User foundUser = users.get("1");
        if (foundUser != null) {
            System.out.println("Found User: " + foundUser.getId() + ", " + foundUser.getName());
            foundUser.setName("Esteban");
            users.put(foundUser.key(), foundUser);
        } else {
            System.out.println("User not found.");
        }
        users.remove("2");

        for (var entry : users.entrySet()) {
            System.out.println("Final Map \n Id: " + entry.getKey() + ", Name: " + entry.getValue().getName());
        }
    }
}
