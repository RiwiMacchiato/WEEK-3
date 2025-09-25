package studentMS;

import java.util.ArrayList;
import java.util.HashMap;

public class PersonRepo implements Repository<Person>{
    HashMap<Integer,Person> people = new HashMap<>();


    @Override
    public ArrayList<Person> findAll() {
        ArrayList<Person> arrayListPeople = new ArrayList<>();
        for(var person: people.entrySet()){
            arrayListPeople.add(person.getValue());
        }
        return arrayListPeople;
    }

    @Override
    public void save(Person t) {
        people.put(t.getId(), t);
    }

    @Override
    public Person findById(int id) {
        return people.get(id);
    }

    @Override
    public void delete(int id) {
        people.remove(id);
    }

}
