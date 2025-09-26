package javaBasic.Activity_3;
import java.util.HashMap;

public class Aganda {

    HashMap<String, String> contacts = new HashMap<>();


    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }


    public String getPhone(String name) {
        return contacts.get(name);
    }

    public void showContacts() {
        System.out.println("Agenda:");
        System.out.println("____________");
        for (String name : contacts.keySet()) {
            System.out.println(name + ": " + contacts.get(name));
        }
    }
}
