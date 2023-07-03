package W8;

public class MotorBike extends Vehicle {
    //attribute
    private boolean hasSidecar;
    //constructor
    public MotorBike(String brand, String model, String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }
    //setter
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
    //getter
    public boolean isHasSidecar() {return hasSidecar;}
    //override method
    public String getInfo() {
        String ans = "Motor Bike: \n";
        ans = ans + "\t Brand: " + brand + "\n";
        ans = ans + "\t Model: " + model + "\n";
        ans = ans + "\t Registration Number: " + registrationNumber + "\n";
        ans = ans + "\t Has Side Car: " + hasSidecar + "\n";
        ans = ans + "\t Belongs to " + owner.getName() + " - " +  owner.getAddress();
        return ans;
    }
}
