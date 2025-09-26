package Exercises.Activity_7;

public class User implements Storable {

    public String id;
    public String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String key() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }
}
