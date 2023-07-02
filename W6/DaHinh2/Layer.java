package W6.DaHinh2;
import java.util.List;
import java.util.ArrayList;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<Shape>();
    }
    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    public void removeCircles() {
        for(int i = shapes.size() - 1; i >= 0; i--) {
            if(shapes.get(i) instanceof Circle)
                shapes.remove(i);
        }
    }
    public String getInfo() {
        String ans = "Layer of crazy shapes: \n";
        for(int i = 0; i < shapes.size(); i++) {
            ans = ans + shapes.get(i).toString() + "\n";
        }
        return ans;
    }
    public void removeDuplicates() {
        int i = 0;
        while(i < shapes.size()) {
            for(int j = shapes.size() - 1; j > i; j--) {
                if(shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
            i++;
        }
    }
}
