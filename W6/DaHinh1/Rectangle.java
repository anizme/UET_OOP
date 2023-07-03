package W6.DaHinh1;

public class Rectangle extends Shape {
    //attribute
    protected double width;
    protected double length;
    //constructor
    public Rectangle() {
        super();
        width = 0;
        length = 0;
    }
    public Rectangle(double w, double l) {
        super();
        width = w;
        length = l;
    }
    public Rectangle(double w, double l, String s, boolean b) {
        super(s, b);
        width = w;
        length = l;
    }
    //setter
    public void setWidth(double w) {
        width = w;
    }
    public void setLength(double l) {
        length = l;
    }
    //getter
    public double getWidth() {return width;}
    public double getLength() {return length;}
    //override method
    @Override
    public double getArea() {return width * length;}
    @Override
    public double getPerimeter() {return 2 * (length + width);}
    //toString
    @Override
    public String toString(){
        return "Rectangle[width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
    }
}
