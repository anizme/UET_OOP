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
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
        topLeft = new Point(0, 0);
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        topLeft = new Point(0, 0);
    }
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }
    //setter
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
    }
}
