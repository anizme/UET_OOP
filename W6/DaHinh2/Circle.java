package W6.DaHinh2;

public class Circle extends Shape {
    //attribute
    protected Point center;
    protected double radius;
    //constructor
    public Circle() {
        super();
        center = new Point(0, 0);
        radius = 0;
    }
    public Circle(double r) {
        super();
        center = new Point(0, 0);
        radius = r;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        center = new Point(0, 0);
    }
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }
    //setter
    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    //getter
    public Point getCenter() {return center;}
    public double getRadius() {return radius;}
    @Override
    public double getArea() {return Math.PI * radius * radius;}
    @Override
    public double getPerimeter() {return Math.PI * 2 * radius;}
    //equals
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Circle == false) return false;
        return (center.equals(((Circle)obj).getCenter()) && Math.abs(radius - ((Circle)obj).getRadius()) <= 0.001);
    }
    //hashCode

    //toString
    @Override
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + radius + "," + super.toString() + "]";
    }
}
