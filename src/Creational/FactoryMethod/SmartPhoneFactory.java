package Creational.FactoryMethod;

public class SmartPhoneFactory {
    public static SmartPhone getInstance(String name, String modelName) {
        if (name == "iphone") {
            return new IPhone(modelName);
        } else if (name == "samsung") {
            return new Samsung(modelName);
        }
        return null;
    }
}
