package W6.DaHinh1;

public class Circle extends Shape{
    //attribute
    protected double radius;
    //constructor
    public Circle() {
        super();
        radius = 0;
    }
    public Circle(double raius) {
        super();
        this.radius = raius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    //setter
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getter
    public double getRadius() {return radius;}
    //method
    @Override
    public double getArea() {return Math.PI * radius * radius;}
    @Override
    public double getPerimeter() {return Math.PI * 2 * radius;}
    //toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + ",filled=" + filled + "]";
    }
}
