import java.util.HashMap;

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
}


    public void main(String[] args) {
        Agenda myagenda = new Agenda();

        myagenda.addContact("Andres", "123456");
        myagenda.addContact("Johan", "987654");
        myagenda.addContact("Sepulveda", "555888");


}




