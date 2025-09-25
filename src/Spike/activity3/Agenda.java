package Spike.activity3;

import java.util.HashMap;
import java.util.Scanner;

public class Agenda {


    private HashMap<String, String> contacts = new HashMap<>();

    public Agenda() {
        contacts = new HashMap<>();
    }

    // Add a new contact
    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    // Search a contact by name
    public String searchContact(String name) {
        return contacts.get(name);
    }

    public static void main(String[] args) {
        Agenda myAgenda = new Agenda();

        // Adding 3 contacts
        myAgenda.addContact("Alice", "123-456-7890");
        myAgenda.addContact("Bob", "987-654-3210");
        myAgenda.addContact("Charlie", "555-123-4567");

        // Input for searching
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name to search: ");
        String nameToSearch = scanner.nextLine();

        // Searching and printing result
        String phone = myAgenda.searchContact(nameToSearch);
        if (phone != null) {
            System.out.println("Phone number for " + nameToSearch + ": " + phone);
        } else {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}
