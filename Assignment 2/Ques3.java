
interface Drawable {
    String drawingColor();
    int thickness();
}


interface Fillable {
    String fillingColor();
    int size();
}

// Create the Line class that implements both interfaces
class Line implements Drawable{
    String drawingColor;
    int thickness;

    public Line(String drawingColor, int thickness) {
        this.drawingColor = drawingColor;
        this.thickness = thickness;
    }
    @Override
    public String drawingColor() {
        return drawingColor;
    }
    @Override
    public int thickness() {
        return thickness;
    }

}

class Circle implements Fillable {
    String fillingColor;
    int size;

    public Circle(String fillingColor, int size) {
        this.fillingColor = fillingColor;
        this.size = size;
    }

    @Override
    public String fillingColor() {
        return fillingColor;
    }

    @Override
    public int size() {
        return size;
    }
}
class Square implements Fillable {
    String fillingColor;
    int size;

    public Square(String fillingColor, int size) {
        this.fillingColor = fillingColor;
        this.size = size;
    }

    @Override
    public String fillingColor() {
        return fillingColor;
    }

    @Override
    public int size() {
        return size;
    }
}
public class Ques3 {
    public static void main(String[] args) {
        Line line = new Line("Black", 10);
        Circle circle = new Circle("Red", 5);
        Square square = new Square("Green", 6);

        System.out.println("Line Drawing Color: " + line.drawingColor());
        System.out.println("Line Thickness: " + line.thickness());


        System.out.println("Circle Filling Color: " + circle.fillingColor());
        System.out.println("Circle Size: " + circle.size());

        System.out.println("Square Filling Color: " + square.fillingColor());
        System.out.println("Square Size: " + square.size());
    }
}


