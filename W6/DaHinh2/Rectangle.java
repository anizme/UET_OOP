package W6.DaHinh2;

public class Rectangle extends Shape{
    //attribute
    protected Point topLeft;
    protected double width;
    protected double length;
    //constructor
    public Rectangle() {
        super();
        topLeft = new Point(0, 0);
        width = 0;
        length = 0;
    }
    public Rectangle(double w, double l) {
        super();
        width = w;
        length = l;
        topLeft = new Point(0, 0);
    }
    public Rectangle(double w, double l, String s, boolean b) {
        super(s, b);
        width = w;
        length = l;
        topLeft = new Point(0, 0);
    }
    public Rectangle(Point p, double w, double l, String s, boolean b) {
        super(s, b);
        topLeft = p;
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
    public void setTopLeft(Point t) {
        topLeft = t;
    }
    //getter
    public double getWidth() {return width;}
    public double getLength() {return length;}
    public Point getTopLeft() {return topLeft;}
    @Override
    public double getArea() {return width * length;}
    @Override
    public double getPerimeter() {return 2 * (length + width);}
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Rectangle == false && obj instanceof Square == false) return false;
        return (topLeft.equals(((Rectangle)obj).getTopLeft()) && width == ((Rectangle)obj).getWidth() && length == ((Rectangle)obj).getLength());
    }
    //hashCode

    //toString
    @Override
    public String toString(){
        return "Rectangle[" + "topLeft=" + topLeft.toString() + ",width=" + width + ",length=" + length + "," + super.toString() + "]";
    }
}
