package W6.DaHinh1;

public class Square extends Rectangle {
    //constructor
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String s, boolean b) {
        super(side, side, s, b);
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
        return "Square[side=" + getLength() + ",color=" + color + ",filled=" + filled + "]";
    }
}
