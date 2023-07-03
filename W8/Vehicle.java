package W8;

public abstract class Vehicle {
    //attribute
    protected String brand;
    protected String model;
    protected String registrationNumber;
    protected Person owner;
    //constructor
    public Vehicle(String brand, String model, String registrationNumber, Person owner) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }
    //setter
    public void transferOwnership(Person newOwner) {
        owner = newOwner;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    //getter
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public String getRegistrationNumbet() {return registrationNumber;}
    public Person getOwner() {return owner;}
    //abstract method
    abstract public String getInfo();

}
