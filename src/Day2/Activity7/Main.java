package Day2.Activity7;

import java.util.HashMap;

public class Main {

    public static void main (String[] args) {

        HashMap<String, User> using = new HashMap<>();

        User u1 = new User("01", "Emanuel");
        User u2 = new User("02", "Andres");
        User u3 = new User("03", "Johan");
        User u4 = new User("04", "Sandra");

        using.put(u1.key(), u1);
        using.put(u2.key(), u2);
        using.put(u3.key(), u3);
        using.put(u4.key(), u4);


    }
}
