package W5.KeThua1;

public class Circle {
    //attribute
    private double radius;
    private String color;

    //constant
    final static protected double PI = 3.14;
    //constructor
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        color = "red";
    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    //setter
    public void setColor(String color){
        this.color = color;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    //getter
    public String getColor() {return color;}
    public Double getRadius() {return radius;}
    
    public double getArea() {return PI * radius * radius;}
    //toString
    public String toString(){
        return "Circle[raiuds=" + radius + ",color=" + color +"]";
    }
}
