package Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        IShape shapeCircle = shapeFactory.getShape("Circle");
        shapeCircle.drawShape();
        IShape shapeEllipse = shapeFactory.getShape("Ellipse");
        shapeEllipse.drawShape();

        IShape shapeRectangle = shapeFactory.getShape("Rectangle");
        shapeRectangle.drawShape();

        IShape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.drawShape();
    }
}
