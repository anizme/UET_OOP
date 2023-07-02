package W5.KeThua1;

public class Person {
    //attribute
    protected String name;
    protected int age;
    //constructor
    public Person(){
        name = "";
        age = 0;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    //getter
    public String getName() {return name;}
    public int getAge() {return age;}

}
