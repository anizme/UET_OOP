package W5.Kethua2;

public class Main {
    public static void main(String[] args){
        Person s = new Student("Hai Anh", "Ha Tinh", "CN8", 2022, 35);
        Staff st = new Staff("Anizme", "Ha Noi", "UET", 18.5);
        System.out.println(s.toString());
        System.out.println(st.toString());
    }
}
