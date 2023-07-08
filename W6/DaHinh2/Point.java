package W6.DaHinh2;

public class Point {
    //attribute
    private double pointX;
    private double pointY;
    //constructor
    public Point(double x, double y) {
        pointX = x;
        pointY = y;
    }
    //setter
    public void setPointX(double x) {
        pointX = x;
    }
    public void setPointY(double y) {
        pointY = y;
    }
    //getter
    public double getPointX() {return pointX;}
    public double getPointY() {return pointY;}
    //method
    public double distance(Point other) {
        return Math.sqrt((pointX - other.getPointX()) * (pointX - other.getPointX()) + (pointY - other.getPointY()) * (pointY - other.getPointY()));
    }
    public boolean equals(Object obj) {
        if(obj instanceof Point && distance((Point) obj) == 0) return true;
        else return false;
    }
    //hashCode
    
    //toString
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

}
