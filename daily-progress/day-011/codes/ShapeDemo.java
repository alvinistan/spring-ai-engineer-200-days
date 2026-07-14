package codes;

public class ShapeDemo {
    static void main(String[] args) {
        Shape shape;
        shape = new Shape();
        shape.draw();

        shape = new Circle();
        shape.draw();

        shape = new Reactangle();
        shape.draw();
    }
}
