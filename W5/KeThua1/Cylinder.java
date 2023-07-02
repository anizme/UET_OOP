package W5.KeThua1;

public class Cylinder extends Circle{
    //attribute
    private double height;
    //constructor
    public Cylinder(){
        height = 1.0;
    }
    public Cylinder(double radius){
        super(radius);
        height = 1.0;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }
    //setter
    public void setHeight(double height){
        this.height = height;
    }
    //getter 
    public double getHeight() {return height;}

    public double getVolume() {return height * getArea();}
    @Override
    public double getArea() {
        return (2 * super.getArea()) + 2 * PI * getRadius() * height;
    }
    //toString
    @Override
    public String toString(){
        return "Cylinder[" + super.toString() + ",heigh=" + height + "]";
    }

}
