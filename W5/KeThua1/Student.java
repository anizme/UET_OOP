package W5.KeThua1;

public class Student extends Person{
    //attribute
    private String id;
    //constructor
    public Student(int age, String name, String id){
        this.age = age;
        this.name = name;
        this.id = id;
    }
    //setter
    public void setId(String id){
        this.id = id;
    }
    //getter
    public String getId() {return id;}
}
