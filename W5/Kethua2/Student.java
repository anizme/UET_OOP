package W5.Kethua2;

public class Student extends Person {
    //attribute
    private String program;
    private int year;
    private double fee;
    //constructor
    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    //setter
    public void setProgram(String program){
        this.program = program;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setFee(double fee){
        this.fee = fee;
    }
    //getter
    public String getProgram(){return program;}
    public int getYear(){return year;}
    public double getFee(){return fee;}
    //toString
    @Override
    public String toString(){
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
