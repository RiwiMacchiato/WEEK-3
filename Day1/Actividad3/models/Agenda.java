package models;

import java.util.HashMap;

public class Agenda {
    private String name;
    private String phoneNumber;
    private String email;
    private HashMap<String, String> contacts = new HashMap<>();

    public Agenda() {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    public Agenda(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //getAgenda
    public HashMap<String, String> getAgenda() {
        return contacts;
    }
    
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
