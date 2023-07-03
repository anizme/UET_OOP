package W6.DaHinh2;

public class Square extends Rectangle {
    //constructor
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }
    //setter
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double side) {
        setSide(side);
    }
    public void setLength(double side) {
        setSide(side);
    }
    //getter
    public double getSide() {return getLength();}
    //toString
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + getLength() + ",color=" + color + ",filled=" + filled + "]";
    }
}
