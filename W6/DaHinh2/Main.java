package W6.DaHinh2;

public class Main {
    public static void main(String[] args) {
        Layer ly = new Layer();
        Point p = new Point(1, 1);
        Circle c = new Circle(p, 1, "BLUE", true);
        Square s = new Square(p, 1, "WHITE", true);
        Rectangle r = new Rectangle(1, 2, "GREEN", false);
        ly.addShape(r);
        ly.addShape(c);
        ly.addShape(s);
        ly.addShape(c);

        System.out.println("Initial Layer -- " + ly.getInfo());

        ly.removeDuplicates();
        System.out.println("Unique Layer -- " + ly.getInfo());
        
        ly.removeCircles();
        System.out.println("After remove all Circle -- " + ly.getInfo());
    }
}
