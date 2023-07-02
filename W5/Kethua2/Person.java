package W5.Kethua2;

public class Person {
    //attribute
    private String name;
    private String address;
    //constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    //getter
    public String getName() {return name;}
    public String getAddress() {return address;}
    //toString
    public String toString(){
        return "Person[name=" + name + ",address=" + address + "]";
    }

}
