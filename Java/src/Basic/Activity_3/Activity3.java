package javaBasic.Activity_3;

public class Activity3 {
    public static void main(String[] args) {

        Aganda agenda = new Aganda();
        agenda.addContact("Camilo", "123456");
        agenda.addContact("Carlos", "987654");
        agenda.addContact("Ocoro", "555555");

        agenda.showContacts();

        String searchName = "Ocoro";
        String phone = agenda.getPhone(searchName);
        if (phone != null) {
            System.out.println("telefono de" + searchName + ": " + phone);
        } else {
            System.out.println("contacto no encontrado.");
        }
    }
}

