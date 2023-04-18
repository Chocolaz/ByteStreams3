package bytestreams3;

public class LAB1 {
    public static void main(String[] args) {
    Circle circle = new Circle();
    RedShapeDecorator circleDecorator = new RedShapeDecorator(circle);
    circleDecorator.draw();

    Rectangle rectangle = new Rectangle();
    RedShapeDecorator rectangleDecorator = new RedShapeDecorator(rectangle);
    rectangleDecorator.draw();
    }
}
