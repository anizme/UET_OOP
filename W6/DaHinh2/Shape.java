package W6.DaHinh2;

public class Shape {
    //attribute
    protected String color;
    protected boolean filled;
    //constructor
    public Shape(){
        color = "RED";
        filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    //setter
    public void setColor(String color){
        this.color = color;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    //getter
    public String getColor() {return color;}
    public boolean isFilled() {return filled;}
    public double getArea() {return 0;}
    public double getPerimeter() {return 0;}
    //toString 
    @Override
    public String toString(){
        return "color=" + color + ",filled=" + filled;
    }
}
