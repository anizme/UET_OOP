package W6.DaHinh1;

public class Student extends Person {
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

    public void printType() {
    System.out.println("This is a student");
    }

    public static void main(String[] args) {
        Person person = new Student(20, "Anizme", "22028162");
        person.printType();
        
    }
}
