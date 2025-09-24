package spike.activity3;

import java.util.HashMap;

public class Agenda {
    private HashMap<String,String> agenda = new HashMap<>();

    Agenda(){}

    public HashMap<String,String> getAgenda(){
        return agenda;
    }

    public void setAgenda(HashMap<String,String> agenda){
        this.agenda = agenda;
    }
}
