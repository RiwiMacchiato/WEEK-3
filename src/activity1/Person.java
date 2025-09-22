package activity1;

public class Person {

    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        if(name!=null && !name.isEmpty()){
            this.name = name;
        }
    }

    public void setAge(int age){
        if(age>=0){
            this.age = age;
        }
    }

    @Override
    public String toString(){
        return "Me llamo " + name + " y tengo " + age + " años.";
    }
}