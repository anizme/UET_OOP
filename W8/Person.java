package W8;
import java.util.List;
import java.util.ArrayList;

public class Person {
    //attribute
    private String name;
    private String address;
    private List<Vehicle> vehicleList;
    //constructor
    public Person(String name, String address){
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<Vehicle>();
    }
    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }
    //getter
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getVehiclesInfo() {
        if(vehicleList.size() == 0) return name + " has no vehicle! \n";
        String ans = name + " has: \n";
        for(int i = 0; i < vehicleList.size(); i++) {
            ans = ans + vehicleList.get(i).getInfo() + "\n";
        }
        return ans;
    }

}
