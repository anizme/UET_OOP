package W8;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person("Anizme", "My Dinh, Ha Noi");
        Car c1 = new Car("BMW", "Rolls-Royce", "29A - 291.14", p1, 4);
        MotorBike m1 = new MotorBike("Anbico", "Jeek", "38A - MD1 - 979.69", p1, false);
        p1.addVehicle(c1);
        p1.addVehicle(m1);
        System.out.println(p1.getVehiclesInfo());

    }
}
