package W5.Kethua2;

public class Staff extends Person {
    //attribute
    private String school;
    private double pay;
    //constructor
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    //setter
    public void setSchhol(String school){
        this.school = school;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    //getter
    public String getSchool(){return school;}
    public double getPay(){return pay;}
    //toString
    @Override
    public String toString(){
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay +"]";
    }
}
