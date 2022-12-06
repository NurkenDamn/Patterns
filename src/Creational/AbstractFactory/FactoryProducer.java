package Creational.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String Factory) {
        if(Factory == null) {
            return null;
        }
        else if(Factory.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }
        return  null;
    }
}
