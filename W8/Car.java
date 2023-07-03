package W8;

public class Car extends Vehicle {
    //attribute
    private int numberOfDoors;
    //constructor
    public Car(String brand, String model, String registrationNumber, Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }
    //setter
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    //getter
    public int getNumberOfDoors() {return numberOfDoors;}
    //override method
    public String getInfo() {
        String ans = "Car: \n";
        ans = ans + "\t Brand: " + brand + "\n";
        ans = ans + "\t Model: " + model + "\n";
        ans = ans + "\t Registration Number: " + registrationNumber + "\n";
        ans = ans + "\t Number of Doors: " + numberOfDoors + "\n";
        ans = ans + "\t Belongs to " + owner.getName() + " - " +  owner.getAddress();
        return ans;
    }
}
